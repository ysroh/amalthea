package org.eclipse.papyrus.amalthea.generator.transform;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.FInterfacePort;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwSystem;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.IntegerObject;
import org.eclipse.app4mc.amalthea.model.InterProcess;
import org.eclipse.app4mc.amalthea.model.InterfaceKind;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType;
import org.eclipse.app4mc.amalthea.model.NetworkType;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.Port;
import org.eclipse.app4mc.amalthea.model.Preemption;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.app4mc.amalthea.model.Requirement;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SchedType;
import org.eclipse.app4mc.amalthea.model.Severity;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.amalthea.generator.transform.TransformUtil;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.CustomProperty;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Distribution;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Instructions;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.PortCustomProperty;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.SignedTime;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Time;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators;
import org.eclipse.papyrus.amalthea.profile.amalthea.components.Composite;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OSEK;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.PriorityBased;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingHWUnit;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingUnit;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall;
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess;
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic;
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class MainTransform {
  private final ResourceSet rset = new ResourceSetImpl();
  
  private Model root = null;
  
  public void generate(final Model model) {
    try {
      this.root = model;
      final Amalthea transformed = this.transformModel(model);
      final URI uri = model.eResource().getURI().trimFileExtension().appendFileExtension("amxmi");
      final Resource resource = this.rset.createResource(uri);
      resource.getContents().add(transformed);
      resource.save(Collections.EMPTY_MAP);
      resource.unload();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Amalthea transformModel(final Model model) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(model);
    final Amalthea _result;
    synchronized (_createCache_transformModel) {
      if (_createCache_transformModel.containsKey(_cacheKey)) {
        return _createCache_transformModel.get(_cacheKey);
      }
      Amalthea _createAmalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
      _result = _createAmalthea;
      _createCache_transformModel.put(_cacheKey, _result);
    }
    _init_transformModel(_result, model);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Amalthea> _createCache_transformModel = CollectionLiterals.newHashMap();
  
  private void _init_transformModel(final Amalthea it, final Model model) {
    this.transformPackage(model);
    it.setComponentsModel(this.getComponentsModel(model));
    it.setSwModel(this.getSoftwareModel(model));
    it.setHwModel(this.getHardwareModel(model));
    it.setOsModel(this.getOSModel(model));
    it.setStimuliModel(this.getStimuliModel(model));
    it.setMappingModel(this.getMappingModel(model));
    it.setConstraintsModel(this.getConstraintsModel(model));
  }
  
  private EObject _transform(final Object o) {
    return null;
  }
  
  private void transformPackage(final org.eclipse.uml2.uml.Package pkg) {
    final List<EObject> list = TransformUtil.getAmaltheaList(pkg.getPackagedElements());
    final Function1<EObject, EObject> _function = (EObject p) -> {
      return this.transform(p);
    };
    final Function1<EObject, Boolean> _function_1 = (EObject e) -> {
      return Boolean.valueOf((!Objects.equal(e, null)));
    };
    final Iterable<EObject> transformed = IterableExtensions.<EObject>filter(ListExtensions.<EObject, EObject>map(list, _function), _function_1);
    EList<PackageImport> _packageImports = pkg.getPackageImports();
    for (final PackageImport pi : _packageImports) {
      this.transform(pi);
    }
    final SWModel swModel = this.getSoftwareModel(this.root);
    Iterables.<org.eclipse.app4mc.amalthea.model.Runnable>addAll(swModel.getRunnables(), Iterables.<org.eclipse.app4mc.amalthea.model.Runnable>filter(transformed, org.eclipse.app4mc.amalthea.model.Runnable.class));
    Iterables.<Label>addAll(swModel.getLabels(), Iterables.<Label>filter(transformed, Label.class));
    Iterables.<Task>addAll(swModel.getTasks(), Iterables.<Task>filter(transformed, Task.class));
    Iterables.<ISR>addAll(swModel.getIsrs(), Iterables.<ISR>filter(transformed, ISR.class));
    final HWModel hwModel = this.getHardwareModel(this.root);
    Iterables.<CoreType>addAll(hwModel.getCoreTypes(), Iterables.<CoreType>filter(transformed, CoreType.class));
    Iterables.<MicrocontrollerType>addAll(hwModel.getMcTypes(), Iterables.<MicrocontrollerType>filter(transformed, MicrocontrollerType.class));
    Iterables.<NetworkType>addAll(hwModel.getNetworkTypes(), Iterables.<NetworkType>filter(transformed, NetworkType.class));
    final Iterable<HwSystem> system = Iterables.<HwSystem>filter(transformed, HwSystem.class);
    boolean _isEmpty = IterableExtensions.isEmpty(system);
    boolean _not = (!_isEmpty);
    if (_not) {
      hwModel.setSystem(((HwSystem[])Conversions.unwrapArray(system, HwSystem.class))[0]);
    }
    final OSModel osModel = this.getOSModel(this.root);
    Iterables.<OperatingSystem>addAll(osModel.getOperatingSystems(), Iterables.<OperatingSystem>filter(transformed, OperatingSystem.class));
    final ComponentsModel component = this.getComponentsModel(this.root);
    Iterables.<Component>addAll(component.getComponents(), Iterables.<Component>filter(transformed, Component.class));
    final StimuliModel stimuli = this.getStimuliModel(this.root);
    Iterables.<Stimulus>addAll(stimuli.getStimuli(), Iterables.<Stimulus>filter(transformed, Stimulus.class));
    final MappingModel mapping = this.getMappingModel(this.root);
    Iterables.<CoreAllocation>addAll(mapping.getCoreAllocation(), Iterables.<CoreAllocation>filter(transformed, CoreAllocation.class));
    Iterables.<TaskAllocation>addAll(mapping.getTaskAllocation(), Iterables.<TaskAllocation>filter(transformed, TaskAllocation.class));
  }
  
  private EObject _transform(final org.eclipse.uml2.uml.Package pkg) {
    this.transformPackage(pkg);
    return null;
  }
  
  private EObject _transform(final PackageImport pkg) {
    org.eclipse.uml2.uml.Package _importedPackage = pkg.getImportedPackage();
    if (_importedPackage!=null) {
      this.transformPackage(_importedPackage);
    }
    return null;
  }
  
  private SWModel getSoftwareModel(final Model model) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(model);
    final SWModel _result;
    synchronized (_createCache_getSoftwareModel) {
      if (_createCache_getSoftwareModel.containsKey(_cacheKey)) {
        return _createCache_getSoftwareModel.get(_cacheKey);
      }
      SWModel _createSWModel = AmaltheaFactory.eINSTANCE.createSWModel();
      _result = _createSWModel;
      _createCache_getSoftwareModel.put(_cacheKey, _result);
    }
    _init_getSoftwareModel(_result, model);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, SWModel> _createCache_getSoftwareModel = CollectionLiterals.newHashMap();
  
  private void _init_getSoftwareModel(final SWModel it, final Model model) {
  }
  
  private MappingModel getMappingModel(final Model model) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(model);
    final MappingModel _result;
    synchronized (_createCache_getMappingModel) {
      if (_createCache_getMappingModel.containsKey(_cacheKey)) {
        return _createCache_getMappingModel.get(_cacheKey);
      }
      MappingModel _createMappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
      _result = _createMappingModel;
      _createCache_getMappingModel.put(_cacheKey, _result);
    }
    _init_getMappingModel(_result, model);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, MappingModel> _createCache_getMappingModel = CollectionLiterals.newHashMap();
  
  private void _init_getMappingModel(final MappingModel it, final Model model) {
  }
  
  private HWModel getHardwareModel(final Model model) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(model);
    final HWModel _result;
    synchronized (_createCache_getHardwareModel) {
      if (_createCache_getHardwareModel.containsKey(_cacheKey)) {
        return _createCache_getHardwareModel.get(_cacheKey);
      }
      HWModel _createHWModel = AmaltheaFactory.eINSTANCE.createHWModel();
      _result = _createHWModel;
      _createCache_getHardwareModel.put(_cacheKey, _result);
    }
    _init_getHardwareModel(_result, model);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, HWModel> _createCache_getHardwareModel = CollectionLiterals.newHashMap();
  
  private void _init_getHardwareModel(final HWModel it, final Model model) {
  }
  
  private OSModel getOSModel(final Model model) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(model);
    final OSModel _result;
    synchronized (_createCache_getOSModel) {
      if (_createCache_getOSModel.containsKey(_cacheKey)) {
        return _createCache_getOSModel.get(_cacheKey);
      }
      OSModel _createOSModel = AmaltheaFactory.eINSTANCE.createOSModel();
      _result = _createOSModel;
      _createCache_getOSModel.put(_cacheKey, _result);
    }
    _init_getOSModel(_result, model);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, OSModel> _createCache_getOSModel = CollectionLiterals.newHashMap();
  
  private void _init_getOSModel(final OSModel it, final Model model) {
  }
  
  private StimuliModel getStimuliModel(final Model model) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(model);
    final StimuliModel _result;
    synchronized (_createCache_getStimuliModel) {
      if (_createCache_getStimuliModel.containsKey(_cacheKey)) {
        return _createCache_getStimuliModel.get(_cacheKey);
      }
      StimuliModel _createStimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
      _result = _createStimuliModel;
      _createCache_getStimuliModel.put(_cacheKey, _result);
    }
    _init_getStimuliModel(_result, model);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, StimuliModel> _createCache_getStimuliModel = CollectionLiterals.newHashMap();
  
  private void _init_getStimuliModel(final StimuliModel it, final Model model) {
  }
  
  private ComponentsModel getComponentsModel(final Model model) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(model);
    final ComponentsModel _result;
    synchronized (_createCache_getComponentsModel) {
      if (_createCache_getComponentsModel.containsKey(_cacheKey)) {
        return _createCache_getComponentsModel.get(_cacheKey);
      }
      ComponentsModel _createComponentsModel = AmaltheaFactory.eINSTANCE.createComponentsModel();
      _result = _createComponentsModel;
      _createCache_getComponentsModel.put(_cacheKey, _result);
    }
    _init_getComponentsModel(_result, model);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, ComponentsModel> _createCache_getComponentsModel = CollectionLiterals.newHashMap();
  
  private void _init_getComponentsModel(final ComponentsModel it, final Model model) {
  }
  
  private ConstraintsModel getConstraintsModel(final Model model) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(model);
    final ConstraintsModel _result;
    synchronized (_createCache_getConstraintsModel) {
      if (_createCache_getConstraintsModel.containsKey(_cacheKey)) {
        return _createCache_getConstraintsModel.get(_cacheKey);
      }
      ConstraintsModel _createConstraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
      _result = _createConstraintsModel;
      _createCache_getConstraintsModel.put(_cacheKey, _result);
    }
    _init_getConstraintsModel(_result, model);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, ConstraintsModel> _createCache_getConstraintsModel = CollectionLiterals.newHashMap();
  
  private void _init_getConstraintsModel(final ConstraintsModel it, final Model model) {
  }
  
  private EObject _transformHelper(final Counter counter, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(counter, owner);
    final org.eclipse.app4mc.amalthea.model.Counter _result;
    synchronized (_createCache_transformHelper) {
      if (_createCache_transformHelper.containsKey(_cacheKey)) {
        return _createCache_transformHelper.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Counter _createCounter = AmaltheaFactory.eINSTANCE.createCounter();
      _result = _createCounter;
      _createCache_transformHelper.put(_cacheKey, _result);
    }
    _init_transformHelper(_result, counter, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper(final org.eclipse.app4mc.amalthea.model.Counter it, final Counter counter, final Object owner) {
    it.setOffset(counter.getOffset());
    it.setPrescaler(counter.getPrescaler());
  }
  
  private EObject _transformHelper(final Time time, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(time, owner);
    final org.eclipse.app4mc.amalthea.model.Time _result;
    synchronized (_createCache_transformHelper_1) {
      if (_createCache_transformHelper_1.containsKey(_cacheKey)) {
        return _createCache_transformHelper_1.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Time _createTime = AmaltheaFactory.eINSTANCE.createTime();
      _result = _createTime;
      _createCache_transformHelper_1.put(_cacheKey, _result);
    }
    _init_transformHelper_1(_result, time, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_1 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_1(final org.eclipse.app4mc.amalthea.model.Time it, final Time time, final Object owner) {
    it.setValue(time.getValue());
    it.setUnit(TimeUnit.get(time.getUnit().getLiteral()));
  }
  
  private EObject _transformHelper(final SignedTime time, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(time, owner);
    final org.eclipse.app4mc.amalthea.model.SignedTime _result;
    synchronized (_createCache_transformHelper_2) {
      if (_createCache_transformHelper_2.containsKey(_cacheKey)) {
        return _createCache_transformHelper_2.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.SignedTime _createSignedTime = AmaltheaFactory.eINSTANCE.createSignedTime();
      _result = _createSignedTime;
      _createCache_transformHelper_2.put(_cacheKey, _result);
    }
    _init_transformHelper_2(_result, time, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_2 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_2(final org.eclipse.app4mc.amalthea.model.SignedTime it, final SignedTime time, final Object owner) {
    it.setValue(time.getValue());
    it.setUnit(TimeUnit.get(time.getUnit().getLiteral()));
  }
  
  /**
   * Software
   */
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable runnable) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(runnable);
    final org.eclipse.app4mc.amalthea.model.Runnable _result;
    synchronized (_createCache_transform) {
      if (_createCache_transform.containsKey(_cacheKey)) {
        return _createCache_transform.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Runnable _createRunnable = AmaltheaFactory.eINSTANCE.createRunnable();
      _result = _createRunnable;
      _createCache_transform.put(_cacheKey, _result);
    }
    _init_transform(_result, runnable);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform = CollectionLiterals.newHashMap();
  
  private void _init_transform(final org.eclipse.app4mc.amalthea.model.Runnable it, final org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable runnable) {
    final org.eclipse.uml2.uml.Class base = runnable.getBase_Class();
    it.setName(base.getName());
    it.setCallback(runnable.isCallback());
    it.setService(runnable.isService());
    final Function1<EObject, EObject> _function = (EObject o) -> {
      return this.transform(o);
    };
    final List<EObject> mappedElements = ListExtensions.<EObject, EObject>map(TransformUtil.getAmaltheaList(base.getOwnedElements()), _function);
    Iterables.<RunnableItem>addAll(it.getRunnableItems(), Iterables.<RunnableItem>filter(mappedElements, RunnableItem.class));
    this.transformCustomProperties(base, it);
  }
  
  private EObject _transform(final LabelAccess label) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(label);
    final org.eclipse.app4mc.amalthea.model.LabelAccess _result;
    synchronized (_createCache_transform_1) {
      if (_createCache_transform_1.containsKey(_cacheKey)) {
        return _createCache_transform_1.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.LabelAccess _createLabelAccess = AmaltheaFactory.eINSTANCE.createLabelAccess();
      _result = _createLabelAccess;
      _createCache_transform_1.put(_cacheKey, _result);
    }
    _init_transform_1(_result, label);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_1 = CollectionLiterals.newHashMap();
  
  private void _init_transform_1(final org.eclipse.app4mc.amalthea.model.LabelAccess it, final LabelAccess label) {
    it.setAccess(LabelAccessEnum.READ);
    org.eclipse.papyrus.amalthea.profile.amalthea.software.Label _data = label.getData();
    EObject _transform = null;
    if (_data!=null) {
      _transform=this.transform(_data);
    }
    it.setData(((Label) _transform));
  }
  
  private EObject _transform(final RunnableInstructions instruction) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(instruction);
    final org.eclipse.app4mc.amalthea.model.RunnableInstructions _result;
    synchronized (_createCache_transform_2) {
      if (_createCache_transform_2.containsKey(_cacheKey)) {
        return _createCache_transform_2.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.RunnableInstructions _createRunnableInstructions = AmaltheaFactory.eINSTANCE.createRunnableInstructions();
      _result = _createRunnableInstructions;
      _createCache_transform_2.put(_cacheKey, _result);
    }
    _init_transform_2(_result, instruction);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_2 = CollectionLiterals.newHashMap();
  
  private void _init_transform_2(final org.eclipse.app4mc.amalthea.model.RunnableInstructions it, final RunnableInstructions instruction) {
    Instructions _default = instruction.getDefault();
    EObject _transformHelper = null;
    if (_default!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_default, _object);
    }
    final InstructionsDeviation dist = ((InstructionsDeviation) _transformHelper);
    it.setDefault(dist);
  }
  
  private EObject _transformHelper(final org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation instructionsDeviation, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(instructionsDeviation, owner);
    final InstructionsDeviation _result;
    synchronized (_createCache_transformHelper_3) {
      if (_createCache_transformHelper_3.containsKey(_cacheKey)) {
        return _createCache_transformHelper_3.get(_cacheKey);
      }
      InstructionsDeviation _createInstructionsDeviation = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
      _result = _createInstructionsDeviation;
      _createCache_transformHelper_3.put(_cacheKey, _result);
    }
    _init_transformHelper_3(_result, instructionsDeviation, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_3 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_3(final InstructionsDeviation it, final org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation instructionsDeviation, final Object owner) {
    Deviation _deviation = instructionsDeviation.getDeviation();
    EObject _transformHelper = null;
    if (_deviation!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_deviation, _object);
    }
    it.setDeviation(((org.eclipse.app4mc.amalthea.model.Deviation) _transformHelper));
  }
  
  private EObject _transformHelper(final Deviation instruction, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(instruction, owner);
    final org.eclipse.app4mc.amalthea.model.Deviation<Object> _result;
    synchronized (_createCache_transformHelper_4) {
      if (_createCache_transformHelper_4.containsKey(_cacheKey)) {
        return _createCache_transformHelper_4.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Deviation<Object> _createDeviation = AmaltheaFactory.eINSTANCE.<Object>createDeviation();
      _result = _createDeviation;
      _createCache_transformHelper_4.put(_cacheKey, _result);
    }
    _init_transformHelper_4(_result, instruction, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_4 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_4(final org.eclipse.app4mc.amalthea.model.Deviation<Object> it, final Deviation instruction, final Object owner) {
    Distribution _distribution = instruction.getDistribution();
    EObject _transformHelper = null;
    if (_distribution!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_distribution, _object);
    }
    it.setDistribution(((org.eclipse.app4mc.amalthea.model.Distribution) _transformHelper));
  }
  
  private EObject _transformHelper(final WeibullEstimators weibull, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(weibull, owner);
    final org.eclipse.app4mc.amalthea.model.WeibullEstimators<Object> _result;
    synchronized (_createCache_transformHelper_5) {
      if (_createCache_transformHelper_5.containsKey(_cacheKey)) {
        return _createCache_transformHelper_5.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.WeibullEstimators<Object> _createWeibullEstimators = AmaltheaFactory.eINSTANCE.<Object>createWeibullEstimators();
      _result = _createWeibullEstimators;
      _createCache_transformHelper_5.put(_cacheKey, _result);
    }
    _init_transformHelper_5(_result, weibull, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_5 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_5(final org.eclipse.app4mc.amalthea.model.WeibullEstimators<Object> it, final WeibullEstimators weibull, final Object owner) {
    it.setPRemainPromille(weibull.getPRemainPromille());
    final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();
    mean.setValue(weibull.getMean());
    it.setMean(mean);
  }
  
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.software.Label label) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(label);
    final Label _result;
    synchronized (_createCache_transform_3) {
      if (_createCache_transform_3.containsKey(_cacheKey)) {
        return _createCache_transform_3.get(_cacheKey);
      }
      Label _createLabel = AmaltheaFactory.eINSTANCE.createLabel();
      _result = _createLabel;
      _createCache_transform_3.put(_cacheKey, _result);
    }
    _init_transform_3(_result, label);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_3 = CollectionLiterals.newHashMap();
  
  private void _init_transform_3(final Label it, final org.eclipse.papyrus.amalthea.profile.amalthea.software.Label label) {
    it.setName(label.getBase_Class().getName());
    this.transformCustomProperties(label.getBase_Class(), it);
  }
  
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.software.Task task) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(task);
    final Task _result;
    synchronized (_createCache_transform_4) {
      if (_createCache_transform_4.containsKey(_cacheKey)) {
        return _createCache_transform_4.get(_cacheKey);
      }
      Task _createTask = AmaltheaFactory.eINSTANCE.createTask();
      _result = _createTask;
      _createCache_transform_4.put(_cacheKey, _result);
    }
    _init_transform_4(_result, task);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_4 = CollectionLiterals.newHashMap();
  
  private void _init_transform_4(final Task it, final org.eclipse.papyrus.amalthea.profile.amalthea.software.Task task) {
    it.setName(task.getBase_Class().getName());
    it.setMultipleTaskActivationLimit(task.getMultipleTaskActivationLimit());
    it.setPreemption(Preemption.get(task.getPreemption().getLiteral()));
    this.transformProcessHelper(task, it);
  }
  
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR isr) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(isr);
    final ISR _result;
    synchronized (_createCache_transform_5) {
      if (_createCache_transform_5.containsKey(_cacheKey)) {
        return _createCache_transform_5.get(_cacheKey);
      }
      ISR _createISR = AmaltheaFactory.eINSTANCE.createISR();
      _result = _createISR;
      _createCache_transform_5.put(_cacheKey, _result);
    }
    _init_transform_5(_result, isr);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_5 = CollectionLiterals.newHashMap();
  
  private void _init_transform_5(final ISR it, final org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR isr) {
    it.setName(isr.getBase_Class().getName());
    this.transformProcessHelper(isr, it);
  }
  
  private void transformProcessHelper(final org.eclipse.papyrus.amalthea.profile.amalthea.software.Process source, final org.eclipse.app4mc.amalthea.model.Process target) {
    target.setPriority(source.getPriority());
    CallGraph _callgraph = source.getCallgraph();
    EObject _transformHelper = null;
    if (_callgraph!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_callgraph, _object);
    }
    final org.eclipse.app4mc.amalthea.model.CallGraph callGraph = ((org.eclipse.app4mc.amalthea.model.CallGraph) _transformHelper);
    target.setCallGraph(callGraph);
    final Function1<EObject, EObject> _function = (EObject e) -> {
      return this.transform(e);
    };
    Iterables.<Requirement>addAll(this.getConstraintsModel(this.root).getRequirements(), Iterables.<ProcessRequirement>filter(ListExtensions.<EObject, EObject>map(TransformUtil.getAmaltheaFilteredList(source.getBase_Class().getOwnedRules()), _function), ProcessRequirement.class));
    this.transformCustomProperties(source.getBase_Class(), target);
  }
  
  private EObject _transformHelper(final CallGraph callGraph, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(callGraph, owner);
    final org.eclipse.app4mc.amalthea.model.CallGraph _result;
    synchronized (_createCache_transformHelper_6) {
      if (_createCache_transformHelper_6.containsKey(_cacheKey)) {
        return _createCache_transformHelper_6.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.CallGraph _createCallGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
      _result = _createCallGraph;
      _createCache_transformHelper_6.put(_cacheKey, _result);
    }
    _init_transformHelper_6(_result, callGraph, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_6 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_6(final org.eclipse.app4mc.amalthea.model.CallGraph it, final CallGraph callGraph, final Object owner) {
    final Function1<GraphEntry, EObject> _function = (GraphEntry e) -> {
      Object _object = new Object();
      return this.transformHelper(e, _object);
    };
    final Iterable<GraphEntryBase> graphEntries = Iterables.<GraphEntryBase>filter(ListExtensions.<GraphEntry, EObject>map(callGraph.getGraphentries(), _function), GraphEntryBase.class);
    Iterables.<GraphEntryBase>addAll(it.getGraphEntries(), graphEntries);
    this.transformCustomProperties(callGraph.getBase_Class(), it);
  }
  
  private EObject _transformHelper(final CallSequence callSequence, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(callSequence, owner);
    final org.eclipse.app4mc.amalthea.model.CallSequence _result;
    synchronized (_createCache_transformHelper_7) {
      if (_createCache_transformHelper_7.containsKey(_cacheKey)) {
        return _createCache_transformHelper_7.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.CallSequence _createCallSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
      _result = _createCallSequence;
      _createCache_transformHelper_7.put(_cacheKey, _result);
    }
    _init_transformHelper_7(_result, callSequence, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_7 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_7(final org.eclipse.app4mc.amalthea.model.CallSequence it, final CallSequence callSequence, final Object owner) {
    final org.eclipse.uml2.uml.Class base = callSequence.getBase_Class();
    it.setName(base.getName());
    final Function1<EObject, EObject> _function = (EObject e) -> {
      return this.transform(e);
    };
    final Iterable<CallSequenceItem> items = Iterables.<CallSequenceItem>filter(ListExtensions.<EObject, EObject>map(TransformUtil.getAmaltheaFilteredList(base.getOwnedOperations()), _function), CallSequenceItem.class);
    Iterables.<CallSequenceItem>addAll(it.getCalls(), items);
    this.transformCustomProperties(base, it);
  }
  
  private EObject _transform(final TaskRunnableCall call) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(call);
    final org.eclipse.app4mc.amalthea.model.TaskRunnableCall _result;
    synchronized (_createCache_transform_6) {
      if (_createCache_transform_6.containsKey(_cacheKey)) {
        return _createCache_transform_6.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.TaskRunnableCall _createTaskRunnableCall = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
      _result = _createTaskRunnableCall;
      _createCache_transform_6.put(_cacheKey, _result);
    }
    _init_transform_6(_result, call);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_6 = CollectionLiterals.newHashMap();
  
  private void _init_transform_6(final org.eclipse.app4mc.amalthea.model.TaskRunnableCall it, final TaskRunnableCall call) {
    EObject _transform = this.transform(call.getRunnable());
    it.setRunnable(((org.eclipse.app4mc.amalthea.model.Runnable) _transform));
    Counter _counter = call.getCounter();
    EObject _transformHelper = null;
    if (_counter!=null) {
      _transformHelper=this.transformHelper(_counter, call);
    }
    it.setCounter(((org.eclipse.app4mc.amalthea.model.Counter) _transformHelper));
  }
  
  private EObject _transform(final InterProcessActivation call) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(call);
    final org.eclipse.app4mc.amalthea.model.InterProcessActivation _result;
    synchronized (_createCache_transform_7) {
      if (_createCache_transform_7.containsKey(_cacheKey)) {
        return _createCache_transform_7.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.InterProcessActivation _createInterProcessActivation = AmaltheaFactory.eINSTANCE.createInterProcessActivation();
      _result = _createInterProcessActivation;
      _createCache_transform_7.put(_cacheKey, _result);
    }
    _init_transform_7(_result, call);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_7 = CollectionLiterals.newHashMap();
  
  private void _init_transform_7(final org.eclipse.app4mc.amalthea.model.InterProcessActivation it, final InterProcessActivation call) {
    Counter _counter = call.getCounter();
    EObject _transformHelper = null;
    if (_counter!=null) {
      _transformHelper=this.transformHelper(_counter, call);
    }
    it.setCounter(((org.eclipse.app4mc.amalthea.model.Counter) _transformHelper));
  }
  
  /**
   * Hardware
   */
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem system) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(system);
    final HwSystem _result;
    synchronized (_createCache_transform_8) {
      if (_createCache_transform_8.containsKey(_cacheKey)) {
        return _createCache_transform_8.get(_cacheKey);
      }
      HwSystem _createHwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
      _result = _createHwSystem;
      _createCache_transform_8.put(_cacheKey, _result);
    }
    _init_transform_8(_result, system);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_8 = CollectionLiterals.newHashMap();
  
  private void _init_transform_8(final HwSystem it, final org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem system) {
    it.setName(system.getBase_Class().getName());
    final Function1<ECU, EObject> _function = (ECU e) -> {
      return this.transform(e);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.ECU> ecus = Iterables.<org.eclipse.app4mc.amalthea.model.ECU>filter(ListExtensions.<ECU, EObject>map(system.getEcus(), _function), org.eclipse.app4mc.amalthea.model.ECU.class);
    final Function1<Quartz, EObject> _function_1 = (Quartz e) -> {
      return this.transformHelper(e, system);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Quartz> quartz = Iterables.<org.eclipse.app4mc.amalthea.model.Quartz>filter(ListExtensions.<Quartz, EObject>map(system.getQuartzes(), _function_1), org.eclipse.app4mc.amalthea.model.Quartz.class);
    Prescaler _prescaler = system.getPrescaler();
    EObject _transformHelper = null;
    if (_prescaler!=null) {
      _transformHelper=this.transformHelper(_prescaler, system);
    }
    final org.eclipse.app4mc.amalthea.model.Prescaler prescaler = ((org.eclipse.app4mc.amalthea.model.Prescaler) _transformHelper);
    final Function1<Network, EObject> _function_2 = (Network e) -> {
      return this.transformHelper(e, system);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Network> networks = Iterables.<org.eclipse.app4mc.amalthea.model.Network>filter(ListExtensions.<Network, EObject>map(system.getNetworks(), _function_2), org.eclipse.app4mc.amalthea.model.Network.class);
    Iterables.<org.eclipse.app4mc.amalthea.model.ECU>addAll(it.getEcus(), ecus);
    Iterables.<org.eclipse.app4mc.amalthea.model.Quartz>addAll(it.getQuartzes(), quartz);
    it.setPrescaler(prescaler);
    Iterables.<org.eclipse.app4mc.amalthea.model.Network>addAll(it.getNetworks(), networks);
    this.transformCustomProperties(system.getBase_Class(), it);
  }
  
  private EObject _transform(final ECU ecu) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(ecu);
    final org.eclipse.app4mc.amalthea.model.ECU _result;
    synchronized (_createCache_transform_9) {
      if (_createCache_transform_9.containsKey(_cacheKey)) {
        return _createCache_transform_9.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.ECU _createECU = AmaltheaFactory.eINSTANCE.createECU();
      _result = _createECU;
      _createCache_transform_9.put(_cacheKey, _result);
    }
    _init_transform_9(_result, ecu);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_9 = CollectionLiterals.newHashMap();
  
  private void _init_transform_9(final org.eclipse.app4mc.amalthea.model.ECU it, final ECU ecu) {
    it.setName(ecu.getBase_Class().getName());
    final Function1<Microcontroller, EObject> _function = (Microcontroller e) -> {
      return this.transform(e);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Microcontroller> processors = Iterables.<org.eclipse.app4mc.amalthea.model.Microcontroller>filter(ListExtensions.<Microcontroller, EObject>map(ecu.getMicrocontrollers(), _function), org.eclipse.app4mc.amalthea.model.Microcontroller.class);
    final Function1<Quartz, EObject> _function_1 = (Quartz e) -> {
      Object _object = new Object();
      return this.transformHelper(e, _object);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Quartz> quartz = Iterables.<org.eclipse.app4mc.amalthea.model.Quartz>filter(ListExtensions.<Quartz, EObject>map(ecu.getQuartzes(), _function_1), org.eclipse.app4mc.amalthea.model.Quartz.class);
    Prescaler _prescaler = ecu.getPrescaler();
    EObject _transformHelper = null;
    if (_prescaler!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_prescaler, _object);
    }
    final org.eclipse.app4mc.amalthea.model.Prescaler prescaler = ((org.eclipse.app4mc.amalthea.model.Prescaler) _transformHelper);
    final Function1<Network, EObject> _function_2 = (Network e) -> {
      Object _object_1 = new Object();
      return this.transformHelper(e, _object_1);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Network> networks = Iterables.<org.eclipse.app4mc.amalthea.model.Network>filter(ListExtensions.<Network, EObject>map(ecu.getNetworks(), _function_2), org.eclipse.app4mc.amalthea.model.Network.class);
    Iterables.<org.eclipse.app4mc.amalthea.model.Microcontroller>addAll(it.getMicrocontrollers(), processors);
    Iterables.<org.eclipse.app4mc.amalthea.model.Quartz>addAll(it.getQuartzes(), quartz);
    it.setPrescaler(prescaler);
    Iterables.<org.eclipse.app4mc.amalthea.model.Network>addAll(it.getNetworks(), networks);
    this.transformCustomProperties(ecu.getBase_Class(), it);
  }
  
  private EObject _transform(final Microcontroller processor) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(processor);
    final org.eclipse.app4mc.amalthea.model.Microcontroller _result;
    synchronized (_createCache_transform_10) {
      if (_createCache_transform_10.containsKey(_cacheKey)) {
        return _createCache_transform_10.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Microcontroller _createMicrocontroller = AmaltheaFactory.eINSTANCE.createMicrocontroller();
      _result = _createMicrocontroller;
      _createCache_transform_10.put(_cacheKey, _result);
    }
    _init_transform_10(_result, processor);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_10 = CollectionLiterals.newHashMap();
  
  private void _init_transform_10(final org.eclipse.app4mc.amalthea.model.Microcontroller it, final Microcontroller processor) {
    it.setName(processor.getBase_Class().getName());
    final Function1<Core, EObject> _function = (Core e) -> {
      return this.transform(e);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Core> cores = Iterables.<org.eclipse.app4mc.amalthea.model.Core>filter(ListExtensions.<Core, EObject>map(processor.getCores(), _function), org.eclipse.app4mc.amalthea.model.Core.class);
    final Function1<Quartz, EObject> _function_1 = (Quartz e) -> {
      Object _object = new Object();
      return this.transformHelper(e, _object);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Quartz> quartz = Iterables.<org.eclipse.app4mc.amalthea.model.Quartz>filter(ListExtensions.<Quartz, EObject>map(processor.getQuartzes(), _function_1), org.eclipse.app4mc.amalthea.model.Quartz.class);
    Prescaler _prescaler = processor.getPrescaler();
    EObject _transformHelper = null;
    if (_prescaler!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_prescaler, _object);
    }
    final org.eclipse.app4mc.amalthea.model.Prescaler prescaler = ((org.eclipse.app4mc.amalthea.model.Prescaler) _transformHelper);
    final Function1<Network, EObject> _function_2 = (Network e) -> {
      Object _object_1 = new Object();
      return this.transformHelper(e, _object_1);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Network> networks = Iterables.<org.eclipse.app4mc.amalthea.model.Network>filter(ListExtensions.<Network, EObject>map(processor.getNetworks(), _function_2), org.eclipse.app4mc.amalthea.model.Network.class);
    Iterables.<org.eclipse.app4mc.amalthea.model.Core>addAll(it.getCores(), cores);
    Iterables.<org.eclipse.app4mc.amalthea.model.Quartz>addAll(it.getQuartzes(), quartz);
    it.setPrescaler(prescaler);
    Iterables.<org.eclipse.app4mc.amalthea.model.Network>addAll(it.getNetworks(), networks);
    this.transformCustomProperties(processor.getBase_Class(), it);
  }
  
  private EObject _transform(final Core core) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(core);
    final org.eclipse.app4mc.amalthea.model.Core _result;
    synchronized (_createCache_transform_11) {
      if (_createCache_transform_11.containsKey(_cacheKey)) {
        return _createCache_transform_11.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Core _createCore = AmaltheaFactory.eINSTANCE.createCore();
      _result = _createCore;
      _createCache_transform_11.put(_cacheKey, _result);
    }
    _init_transform_11(_result, core);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_11 = CollectionLiterals.newHashMap();
  
  private void _init_transform_11(final org.eclipse.app4mc.amalthea.model.Core it, final Core core) {
    it.setName(core.getBase_Class().getName());
    org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType _coretype = core.getCoretype();
    EObject _transform = null;
    if (_coretype!=null) {
      _transform=this.transform(_coretype);
    }
    it.setCoreType(((CoreType) _transform));
    final Function1<Quartz, EObject> _function = (Quartz e) -> {
      Object _object = new Object();
      return this.transformHelper(e, _object);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Quartz> quartz = Iterables.<org.eclipse.app4mc.amalthea.model.Quartz>filter(ListExtensions.<Quartz, EObject>map(core.getQuartzes(), _function), org.eclipse.app4mc.amalthea.model.Quartz.class);
    Prescaler _prescaler = core.getPrescaler();
    EObject _transformHelper = null;
    if (_prescaler!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_prescaler, _object);
    }
    final org.eclipse.app4mc.amalthea.model.Prescaler prescaler = ((org.eclipse.app4mc.amalthea.model.Prescaler) _transformHelper);
    final Function1<Network, EObject> _function_1 = (Network e) -> {
      Object _object_1 = new Object();
      return this.transformHelper(e, _object_1);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Network> networks = Iterables.<org.eclipse.app4mc.amalthea.model.Network>filter(ListExtensions.<Network, EObject>map(core.getNetworks(), _function_1), org.eclipse.app4mc.amalthea.model.Network.class);
    Iterables.<org.eclipse.app4mc.amalthea.model.Quartz>addAll(it.getQuartzes(), quartz);
    it.setPrescaler(prescaler);
    Iterables.<org.eclipse.app4mc.amalthea.model.Network>addAll(it.getNetworks(), networks);
    this.transformCustomProperties(core.getBase_Class(), it);
  }
  
  private EObject _transformHelper(final Network network, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(network, owner);
    final org.eclipse.app4mc.amalthea.model.Network _result;
    synchronized (_createCache_transformHelper_8) {
      if (_createCache_transformHelper_8.containsKey(_cacheKey)) {
        return _createCache_transformHelper_8.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Network _createNetwork = AmaltheaFactory.eINSTANCE.createNetwork();
      _result = _createNetwork;
      _createCache_transformHelper_8.put(_cacheKey, _result);
    }
    _init_transformHelper_8(_result, network, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_8 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_8(final org.eclipse.app4mc.amalthea.model.Network it, final Network network, final Object owner) {
    it.setName(network.getBase_Class().getName());
    org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType _networktype = network.getNetworktype();
    EObject _transform = null;
    if (_networktype!=null) {
      _transform=this.transform(_networktype);
    }
    it.setType(((NetworkType) _transform));
    Prescaler _prescaler = network.getPrescaler();
    EObject _transformHelper = null;
    if (_prescaler!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_prescaler, _object);
    }
    it.setPrescaler(((org.eclipse.app4mc.amalthea.model.Prescaler) _transformHelper));
    this.transformCustomProperties(network.getBase_Class(), it);
  }
  
  private EObject _transform(final SystemType type) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(type);
    final org.eclipse.app4mc.amalthea.model.SystemType _result;
    synchronized (_createCache_transform_12) {
      if (_createCache_transform_12.containsKey(_cacheKey)) {
        return _createCache_transform_12.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.SystemType _createSystemType = AmaltheaFactory.eINSTANCE.createSystemType();
      _result = _createSystemType;
      _createCache_transform_12.put(_cacheKey, _result);
    }
    _init_transform_12(_result, type);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_12 = CollectionLiterals.newHashMap();
  
  private void _init_transform_12(final org.eclipse.app4mc.amalthea.model.SystemType it, final SystemType type) {
    it.setName(type.getBase_DataType().getName());
  }
  
  private EObject _transform(final ECUType type) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(type);
    final org.eclipse.app4mc.amalthea.model.ECUType _result;
    synchronized (_createCache_transform_13) {
      if (_createCache_transform_13.containsKey(_cacheKey)) {
        return _createCache_transform_13.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.ECUType _createECUType = AmaltheaFactory.eINSTANCE.createECUType();
      _result = _createECUType;
      _createCache_transform_13.put(_cacheKey, _result);
    }
    _init_transform_13(_result, type);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_13 = CollectionLiterals.newHashMap();
  
  private void _init_transform_13(final org.eclipse.app4mc.amalthea.model.ECUType it, final ECUType type) {
    it.setName(type.getBase_DataType().getName());
  }
  
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType type) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(type);
    final MicrocontrollerType _result;
    synchronized (_createCache_transform_14) {
      if (_createCache_transform_14.containsKey(_cacheKey)) {
        return _createCache_transform_14.get(_cacheKey);
      }
      MicrocontrollerType _createMicrocontrollerType = AmaltheaFactory.eINSTANCE.createMicrocontrollerType();
      _result = _createMicrocontrollerType;
      _createCache_transform_14.put(_cacheKey, _result);
    }
    _init_transform_14(_result, type);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_14 = CollectionLiterals.newHashMap();
  
  private void _init_transform_14(final MicrocontrollerType it, final org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType type) {
    it.setName(type.getBase_DataType().getName());
  }
  
  private EObject _transform(final Bus type) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(type);
    final org.eclipse.app4mc.amalthea.model.Bus _result;
    synchronized (_createCache_transform_15) {
      if (_createCache_transform_15.containsKey(_cacheKey)) {
        return _createCache_transform_15.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Bus _createBus = AmaltheaFactory.eINSTANCE.createBus();
      _result = _createBus;
      _createCache_transform_15.put(_cacheKey, _result);
    }
    _init_transform_15(_result, type);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_15 = CollectionLiterals.newHashMap();
  
  private void _init_transform_15(final org.eclipse.app4mc.amalthea.model.Bus it, final Bus type) {
    it.setName(type.getBase_DataType().getName());
    it.setBitWidth(type.getBitWidth());
    it.setSchedPolicy(SchedType.get(type.getSchedPolicy().getLiteral()));
  }
  
  private EObject _transformHelper(final Quartz quartz, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(quartz, owner);
    final org.eclipse.app4mc.amalthea.model.Quartz _result;
    synchronized (_createCache_transformHelper_9) {
      if (_createCache_transformHelper_9.containsKey(_cacheKey)) {
        return _createCache_transformHelper_9.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Quartz _createQuartz = AmaltheaFactory.eINSTANCE.createQuartz();
      _result = _createQuartz;
      _createCache_transformHelper_9.put(_cacheKey, _result);
    }
    _init_transformHelper_9(_result, quartz, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_9 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_9(final org.eclipse.app4mc.amalthea.model.Quartz it, final Quartz quartz, final Object owner) {
    it.setName(quartz.getBase_Class().getName());
    Frequency _frequency = quartz.getFrequency();
    EObject _transformHelper = null;
    if (_frequency!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_frequency, _object);
    }
    it.setFrequency(((org.eclipse.app4mc.amalthea.model.Frequency) _transformHelper));
    this.transformCustomProperties(quartz.getBase_Class(), it);
  }
  
  private EObject _transformHelper(final Frequency frequency, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(frequency, owner);
    final org.eclipse.app4mc.amalthea.model.Frequency _result;
    synchronized (_createCache_transformHelper_10) {
      if (_createCache_transformHelper_10.containsKey(_cacheKey)) {
        return _createCache_transformHelper_10.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Frequency _createFrequency = AmaltheaFactory.eINSTANCE.createFrequency();
      _result = _createFrequency;
      _createCache_transformHelper_10.put(_cacheKey, _result);
    }
    _init_transformHelper_10(_result, frequency, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_10 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_10(final org.eclipse.app4mc.amalthea.model.Frequency it, final Frequency frequency, final Object owner) {
    it.setValue(frequency.getValue());
    it.setUnit(FrequencyUnit.get(frequency.getUnit().getLiteral()));
  }
  
  private EObject _transformHelper(final Prescaler prescaler, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(prescaler, owner);
    final org.eclipse.app4mc.amalthea.model.Prescaler _result;
    synchronized (_createCache_transformHelper_11) {
      if (_createCache_transformHelper_11.containsKey(_cacheKey)) {
        return _createCache_transformHelper_11.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Prescaler _createPrescaler = AmaltheaFactory.eINSTANCE.createPrescaler();
      _result = _createPrescaler;
      _createCache_transformHelper_11.put(_cacheKey, _result);
    }
    _init_transformHelper_11(_result, prescaler, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_11 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_11(final org.eclipse.app4mc.amalthea.model.Prescaler it, final Prescaler prescaler, final Object owner) {
    it.setName(prescaler.getBase_Class().getName());
    it.setClockRatio(prescaler.getClockRatio());
  }
  
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType type) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(type);
    final CoreType _result;
    synchronized (_createCache_transform_16) {
      if (_createCache_transform_16.containsKey(_cacheKey)) {
        return _createCache_transform_16.get(_cacheKey);
      }
      CoreType _createCoreType = AmaltheaFactory.eINSTANCE.createCoreType();
      _result = _createCoreType;
      _createCache_transform_16.put(_cacheKey, _result);
    }
    _init_transform_16(_result, type);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_16 = CollectionLiterals.newHashMap();
  
  private void _init_transform_16(final CoreType it, final org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType type) {
    it.setName(type.getBase_DataType().getName());
    it.setBitWidth(type.getBitWidth());
    it.setInstructionsPerCycle(type.getInstructionsPerCycle());
  }
  
  /**
   * OS
   */
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem os) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(os);
    final OperatingSystem _result;
    synchronized (_createCache_transform_17) {
      if (_createCache_transform_17.containsKey(_cacheKey)) {
        return _createCache_transform_17.get(_cacheKey);
      }
      OperatingSystem _createOperatingSystem = AmaltheaFactory.eINSTANCE.createOperatingSystem();
      _result = _createOperatingSystem;
      _createCache_transform_17.put(_cacheKey, _result);
    }
    _init_transform_17(_result, os);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_17 = CollectionLiterals.newHashMap();
  
  private void _init_transform_17(final OperatingSystem it, final org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem os) {
    it.setName(os.getBase_Class().getName());
    final Function1<TaskScheduler, EObject> _function = (TaskScheduler e) -> {
      return this.transform(e);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.TaskScheduler> schedulers = Iterables.<org.eclipse.app4mc.amalthea.model.TaskScheduler>filter(ListExtensions.<TaskScheduler, EObject>map(os.getTaskscheduler(), _function), org.eclipse.app4mc.amalthea.model.TaskScheduler.class);
    final Function1<InterruptController, EObject> _function_1 = (InterruptController e) -> {
      return this.transform(e);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.InterruptController> controllers = Iterables.<org.eclipse.app4mc.amalthea.model.InterruptController>filter(ListExtensions.<InterruptController, EObject>map(os.getInterruptcontroller(), _function_1), org.eclipse.app4mc.amalthea.model.InterruptController.class);
    Iterables.<org.eclipse.app4mc.amalthea.model.TaskScheduler>addAll(it.getTaskSchedulers(), schedulers);
    Iterables.<org.eclipse.app4mc.amalthea.model.InterruptController>addAll(it.getInterruptControllers(), controllers);
    this.transformCustomProperties(os.getBase_Class(), it);
  }
  
  private EObject _transform(final TaskScheduler scheduler) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(scheduler);
    final org.eclipse.app4mc.amalthea.model.TaskScheduler _result;
    synchronized (_createCache_transform_18) {
      if (_createCache_transform_18.containsKey(_cacheKey)) {
        return _createCache_transform_18.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.TaskScheduler _createTaskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
      _result = _createTaskScheduler;
      _createCache_transform_18.put(_cacheKey, _result);
    }
    _init_transform_18(_result, scheduler);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_18 = CollectionLiterals.newHashMap();
  
  private void _init_transform_18(final org.eclipse.app4mc.amalthea.model.TaskScheduler it, final TaskScheduler scheduler) {
    it.setName(scheduler.getBase_Class().getName());
    it.setScheduleUnitPriority(scheduler.getScheduleUnitPriority());
    SchedulingUnit _schedulingunit = scheduler.getSchedulingunit();
    EObject _transformHelper = null;
    if (_schedulingunit!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_schedulingunit, _object);
    }
    it.setSchedulingUnit(((org.eclipse.app4mc.amalthea.model.SchedulingUnit) _transformHelper));
    TaskSchedulingAlgorithm _schedulingalgorithm = scheduler.getSchedulingalgorithm();
    EObject _transformHelper_1 = null;
    if (_schedulingalgorithm!=null) {
      Object _object_1 = new Object();
      _transformHelper_1=this.transformHelper(_schedulingalgorithm, _object_1);
    }
    it.setSchedulingAlgorithm(((org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm) _transformHelper_1));
    this.transformCustomProperties(scheduler.getBase_Class(), it);
  }
  
  private EObject _transform(final InterruptController ic) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(ic);
    final org.eclipse.app4mc.amalthea.model.InterruptController _result;
    synchronized (_createCache_transform_19) {
      if (_createCache_transform_19.containsKey(_cacheKey)) {
        return _createCache_transform_19.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.InterruptController _createInterruptController = AmaltheaFactory.eINSTANCE.createInterruptController();
      _result = _createInterruptController;
      _createCache_transform_19.put(_cacheKey, _result);
    }
    _init_transform_19(_result, ic);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_19 = CollectionLiterals.newHashMap();
  
  private void _init_transform_19(final org.eclipse.app4mc.amalthea.model.InterruptController it, final InterruptController ic) {
    it.setName(ic.getBase_Class().getName());
    it.setScheduleUnitPriority(ic.getScheduleUnitPriority());
    SchedulingUnit _schedulingunit = ic.getSchedulingunit();
    EObject _transformHelper = null;
    if (_schedulingunit!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_schedulingunit, _object);
    }
    it.setSchedulingUnit(((org.eclipse.app4mc.amalthea.model.SchedulingUnit) _transformHelper));
    InterruptSchedulingAlgorithm _schedulingalgorithm = ic.getSchedulingalgorithm();
    EObject _transformHelper_1 = null;
    if (_schedulingalgorithm!=null) {
      Object _object_1 = new Object();
      _transformHelper_1=this.transformHelper(_schedulingalgorithm, _object_1);
    }
    it.setSchedulingAlgorithm(((org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm) _transformHelper_1));
    this.transformCustomProperties(ic.getBase_Class(), it);
  }
  
  private EObject _transformHelper(final SchedulingHWUnit schedUnit, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(schedUnit, owner);
    final org.eclipse.app4mc.amalthea.model.SchedulingHWUnit _result;
    synchronized (_createCache_transformHelper_12) {
      if (_createCache_transformHelper_12.containsKey(_cacheKey)) {
        return _createCache_transformHelper_12.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.SchedulingHWUnit _createSchedulingHWUnit = AmaltheaFactory.eINSTANCE.createSchedulingHWUnit();
      _result = _createSchedulingHWUnit;
      _createCache_transformHelper_12.put(_cacheKey, _result);
    }
    _init_transformHelper_12(_result, schedUnit, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_12 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_12(final org.eclipse.app4mc.amalthea.model.SchedulingHWUnit it, final SchedulingHWUnit schedUnit, final Object owner) {
    Time _delay = schedUnit.getDelay();
    EObject _transformHelper = null;
    if (_delay!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_delay, _object);
    }
    it.setDelay(((org.eclipse.app4mc.amalthea.model.Time) _transformHelper));
  }
  
  private EObject _transformHelper(final OSEK osek, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(osek, owner);
    final org.eclipse.app4mc.amalthea.model.OSEK _result;
    synchronized (_createCache_transformHelper_13) {
      if (_createCache_transformHelper_13.containsKey(_cacheKey)) {
        return _createCache_transformHelper_13.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.OSEK _createOSEK = AmaltheaFactory.eINSTANCE.createOSEK();
      _result = _createOSEK;
      _createCache_transformHelper_13.put(_cacheKey, _result);
    }
    _init_transformHelper_13(_result, osek, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_13 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_13(final org.eclipse.app4mc.amalthea.model.OSEK it, final OSEK osek, final Object owner) {
  }
  
  private EObject _transformHelper(final PriorityBased osek, final Object owner) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(osek, owner);
    final org.eclipse.app4mc.amalthea.model.PriorityBased _result;
    synchronized (_createCache_transformHelper_14) {
      if (_createCache_transformHelper_14.containsKey(_cacheKey)) {
        return _createCache_transformHelper_14.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.PriorityBased _createPriorityBased = AmaltheaFactory.eINSTANCE.createPriorityBased();
      _result = _createPriorityBased;
      _createCache_transformHelper_14.put(_cacheKey, _result);
    }
    _init_transformHelper_14(_result, osek, owner);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transformHelper_14 = CollectionLiterals.newHashMap();
  
  private void _init_transformHelper_14(final org.eclipse.app4mc.amalthea.model.PriorityBased it, final PriorityBased osek, final Object owner) {
  }
  
  /**
   * Stimuli
   */
  private EObject _transform(final Periodic stimulus) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(stimulus);
    final org.eclipse.app4mc.amalthea.model.Periodic _result;
    synchronized (_createCache_transform_20) {
      if (_createCache_transform_20.containsKey(_cacheKey)) {
        return _createCache_transform_20.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Periodic _createPeriodic = AmaltheaFactory.eINSTANCE.createPeriodic();
      _result = _createPeriodic;
      _createCache_transform_20.put(_cacheKey, _result);
    }
    _init_transform_20(_result, stimulus);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_20 = CollectionLiterals.newHashMap();
  
  private void _init_transform_20(final org.eclipse.app4mc.amalthea.model.Periodic it, final Periodic stimulus) {
    it.setName(stimulus.getBase_Class().getName());
    Time _offset = stimulus.getOffset();
    EObject _transformHelper = null;
    if (_offset!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_offset, _object);
    }
    it.setOffset(((org.eclipse.app4mc.amalthea.model.Time) _transformHelper));
    Time _recurrence = stimulus.getRecurrence();
    EObject _transformHelper_1 = null;
    if (_recurrence!=null) {
      Object _object_1 = new Object();
      _transformHelper_1=this.transformHelper(_recurrence, _object_1);
    }
    it.setRecurrence(((org.eclipse.app4mc.amalthea.model.Time) _transformHelper_1));
  }
  
  private EObject _transform(final Single stimulus) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(stimulus);
    final org.eclipse.app4mc.amalthea.model.Single _result;
    synchronized (_createCache_transform_21) {
      if (_createCache_transform_21.containsKey(_cacheKey)) {
        return _createCache_transform_21.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Single _createSingle = AmaltheaFactory.eINSTANCE.createSingle();
      _result = _createSingle;
      _createCache_transform_21.put(_cacheKey, _result);
    }
    _init_transform_21(_result, stimulus);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_21 = CollectionLiterals.newHashMap();
  
  private void _init_transform_21(final org.eclipse.app4mc.amalthea.model.Single it, final Single stimulus) {
    it.setName(stimulus.getBase_Class().getName());
    Time _activation = stimulus.getActivation();
    EObject _transformHelper = null;
    if (_activation!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_activation, _object);
    }
    it.setActivation(((org.eclipse.app4mc.amalthea.model.Time) _transformHelper));
  }
  
  private EObject _transform(final Interprocess stimulus) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(stimulus);
    final InterProcess _result;
    synchronized (_createCache_transform_22) {
      if (_createCache_transform_22.containsKey(_cacheKey)) {
        return _createCache_transform_22.get(_cacheKey);
      }
      InterProcess _createInterProcess = AmaltheaFactory.eINSTANCE.createInterProcess();
      _result = _createInterProcess;
      _createCache_transform_22.put(_cacheKey, _result);
    }
    _init_transform_22(_result, stimulus);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_22 = CollectionLiterals.newHashMap();
  
  private void _init_transform_22(final InterProcess it, final Interprocess stimulus) {
    it.setName(stimulus.getBase_Class().getName());
    Counter _counter = stimulus.getCounter();
    EObject _transformHelper = null;
    if (_counter!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_counter, _object);
    }
    it.setCounter(((org.eclipse.app4mc.amalthea.model.Counter) _transformHelper));
  }
  
  /**
   * Constraints
   */
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement pr) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(pr);
    final ProcessRequirement _result;
    synchronized (_createCache_transform_23) {
      if (_createCache_transform_23.containsKey(_cacheKey)) {
        return _createCache_transform_23.get(_cacheKey);
      }
      ProcessRequirement _createProcessRequirement = AmaltheaFactory.eINSTANCE.createProcessRequirement();
      _result = _createProcessRequirement;
      _createCache_transform_23.put(_cacheKey, _result);
    }
    _init_transform_23(_result, pr);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_23 = CollectionLiterals.newHashMap();
  
  private void _init_transform_23(final ProcessRequirement it, final org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement pr) {
    it.setName(pr.getBase_Constraint().getName());
    it.setSeverity(Severity.get(pr.getSeverity().getLiteral()));
    AbstractProcess _process = pr.getProcess();
    EObject _transform = null;
    if (_process!=null) {
      _transform=this.transform(_process);
    }
    it.setProcess(((org.eclipse.app4mc.amalthea.model.AbstractProcess) _transform));
  }
  
  private EObject _transform(final TimeRequirementLimit limit) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(limit);
    final org.eclipse.app4mc.amalthea.model.TimeRequirementLimit _result;
    synchronized (_createCache_transform_24) {
      if (_createCache_transform_24.containsKey(_cacheKey)) {
        return _createCache_transform_24.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.TimeRequirementLimit _createTimeRequirementLimit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
      _result = _createTimeRequirementLimit;
      _createCache_transform_24.put(_cacheKey, _result);
    }
    _init_transform_24(_result, limit);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_24 = CollectionLiterals.newHashMap();
  
  private void _init_transform_24(final org.eclipse.app4mc.amalthea.model.TimeRequirementLimit it, final TimeRequirementLimit limit) {
    it.setLimitType(LimitType.get(limit.getLimitType().getLiteral()));
    it.setMetric(TimeMetric.get(limit.getMetric().getLiteral()));
    SignedTime _limitValue = limit.getLimitValue();
    EObject _transformHelper = null;
    if (_limitValue!=null) {
      Object _object = new Object();
      _transformHelper=this.transformHelper(_limitValue, _object);
    }
    it.setLimitValue(((org.eclipse.app4mc.amalthea.model.SignedTime) _transformHelper));
  }
  
  /**
   * Mapping
   */
  private EObject _transform(final Abstraction ab) {
    this.transformAllocation(ab);
    return null;
  }
  
  private void transformAllocation(final Abstraction ab) {
    final List<EObject> sourceList = TransformUtil.getAmaltheaFilteredList(ab.getClients());
    final List<EObject> targetList = TransformUtil.getAmaltheaFilteredList(ab.getSuppliers());
    if (((!sourceList.isEmpty()) && (!targetList.isEmpty()))) {
      final EObject source = this.transform(sourceList.get(0));
      final EObject target = this.transform(targetList.get(0));
      this.transformAllocation(source, target);
    }
  }
  
  private BaseObject _transformAllocation(final Task task, final org.eclipse.app4mc.amalthea.model.TaskScheduler scheduler) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(task, scheduler);
    final TaskAllocation _result;
    synchronized (_createCache_transformAllocation) {
      if (_createCache_transformAllocation.containsKey(_cacheKey)) {
        return _createCache_transformAllocation.get(_cacheKey);
      }
      TaskAllocation _createTaskAllocation = AmaltheaFactory.eINSTANCE.createTaskAllocation();
      _result = _createTaskAllocation;
      _createCache_transformAllocation.put(_cacheKey, _result);
    }
    _init_transformAllocation(_result, task, scheduler);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, BaseObject> _createCache_transformAllocation = CollectionLiterals.newHashMap();
  
  private void _init_transformAllocation(final TaskAllocation it, final Task task, final org.eclipse.app4mc.amalthea.model.TaskScheduler scheduler) {
    it.setTask(task);
    it.setScheduler(scheduler);
    this.getMappingModel(this.root).getTaskAllocation().add(it);
  }
  
  private BaseObject _transformAllocation(final ISR isr, final org.eclipse.app4mc.amalthea.model.InterruptController controller) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(isr, controller);
    final ISRAllocation _result;
    synchronized (_createCache_transformAllocation_1) {
      if (_createCache_transformAllocation_1.containsKey(_cacheKey)) {
        return _createCache_transformAllocation_1.get(_cacheKey);
      }
      ISRAllocation _createISRAllocation = AmaltheaFactory.eINSTANCE.createISRAllocation();
      _result = _createISRAllocation;
      _createCache_transformAllocation_1.put(_cacheKey, _result);
    }
    _init_transformAllocation_1(_result, isr, controller);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, BaseObject> _createCache_transformAllocation_1 = CollectionLiterals.newHashMap();
  
  private void _init_transformAllocation_1(final ISRAllocation it, final ISR isr, final org.eclipse.app4mc.amalthea.model.InterruptController controller) {
    it.setIsr(isr);
    it.setController(controller);
    this.getMappingModel(this.root).getIsrAllocation().add(it);
  }
  
  private BaseObject _transformAllocation(final org.eclipse.app4mc.amalthea.model.TaskScheduler scheduler, final org.eclipse.app4mc.amalthea.model.Core core) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(scheduler, core);
    final CoreAllocation _result;
    synchronized (_createCache_transformAllocation_2) {
      if (_createCache_transformAllocation_2.containsKey(_cacheKey)) {
        return _createCache_transformAllocation_2.get(_cacheKey);
      }
      CoreAllocation _createCoreAllocation = this.createCoreAllocation(scheduler);
      _result = _createCoreAllocation;
      _createCache_transformAllocation_2.put(_cacheKey, _result);
    }
    _init_transformAllocation_2(_result, scheduler, core);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, BaseObject> _createCache_transformAllocation_2 = CollectionLiterals.newHashMap();
  
  private void _init_transformAllocation_2(final CoreAllocation it, final org.eclipse.app4mc.amalthea.model.TaskScheduler scheduler, final org.eclipse.app4mc.amalthea.model.Core core) {
    it.setScheduler(scheduler);
    it.getCore().add(core);
  }
  
  private CoreAllocation createCoreAllocation(final org.eclipse.app4mc.amalthea.model.TaskScheduler scheduler) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(scheduler);
    final CoreAllocation _result;
    synchronized (_createCache_createCoreAllocation) {
      if (_createCache_createCoreAllocation.containsKey(_cacheKey)) {
        return _createCache_createCoreAllocation.get(_cacheKey);
      }
      CoreAllocation _createCoreAllocation = AmaltheaFactory.eINSTANCE.createCoreAllocation();
      _result = _createCoreAllocation;
      _createCache_createCoreAllocation.put(_cacheKey, _result);
    }
    _init_createCoreAllocation(_result, scheduler);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, CoreAllocation> _createCache_createCoreAllocation = CollectionLiterals.newHashMap();
  
  private void _init_createCoreAllocation(final CoreAllocation it, final org.eclipse.app4mc.amalthea.model.TaskScheduler scheduler) {
    it.setScheduler(scheduler);
    this.getMappingModel(this.root).getCoreAllocation().add(it);
  }
  
  private BaseObject _transformAllocation(final Object task, final Object scheduler) {
    return null;
  }
  
  /**
   * Components
   */
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.components.Component component) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(component);
    final Component _result;
    synchronized (_createCache_transform_25) {
      if (_createCache_transform_25.containsKey(_cacheKey)) {
        return _createCache_transform_25.get(_cacheKey);
      }
      Component _createComponent = AmaltheaFactory.eINSTANCE.createComponent();
      _result = _createComponent;
      _createCache_transform_25.put(_cacheKey, _result);
    }
    _init_transform_25(_result, component);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_25 = CollectionLiterals.newHashMap();
  
  private void _init_transform_25(final Component it, final org.eclipse.papyrus.amalthea.profile.amalthea.components.Component component) {
    it.setName(component.getBase_Class().getName());
    this.transformComponentHelper(component, it);
  }
  
  private void transformCustomProperties(final org.eclipse.uml2.uml.Class container, final IAnnotatable annotatable) {
    final Iterable<CustomProperty> customProperties = Iterables.<CustomProperty>filter(TransformUtil.getAmaltheaFilteredList(container.getOwnedAttributes()), CustomProperty.class);
    for (final CustomProperty custom : customProperties) {
      this.transformCustomProperty(custom, annotatable.getCustomProperties());
    }
  }
  
  private Value _transformCustomProperty(final CustomProperty custom, final EMap<String, Value> map) {
    Value _xblockexpression = null;
    {
      ValueSpecification _defaultValue = custom.getBase_Property().getDefaultValue();
      Value _transformValue = null;
      if (_defaultValue!=null) {
        _transformValue=this.transformValue(_defaultValue);
      }
      final Value value = ((Value) _transformValue);
      _xblockexpression = map.put(custom.getKey(), value);
    }
    return _xblockexpression;
  }
  
  private Value _transformCustomProperty(final PortCustomProperty custom, final EMap<String, Value> map) {
    Value _xblockexpression = null;
    {
      EObject _transform = this.transform(custom.getPort());
      final FInterfacePort port = ((FInterfacePort) _transform);
      ValueSpecification _defaultValue = custom.getBase_Property().getDefaultValue();
      Value _transformValue = null;
      if (_defaultValue!=null) {
        _transformValue=this.transformValue(_defaultValue);
      }
      final Value value = ((Value) _transformValue);
      _xblockexpression = port.getCustomProperties().put(custom.getKey(), value);
    }
    return _xblockexpression;
  }
  
  private Value _transformValue(final LiteralString value) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(value);
    final StringObject _result;
    synchronized (_createCache_transformValue) {
      if (_createCache_transformValue.containsKey(_cacheKey)) {
        return _createCache_transformValue.get(_cacheKey);
      }
      StringObject _createStringObject = AmaltheaFactory.eINSTANCE.createStringObject();
      _result = _createStringObject;
      _createCache_transformValue.put(_cacheKey, _result);
    }
    _init_transformValue(_result, value);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Value> _createCache_transformValue = CollectionLiterals.newHashMap();
  
  private void _init_transformValue(final StringObject it, final LiteralString value) {
    it.setValue(value.getValue());
  }
  
  private Value _transformValue(final LiteralInteger value) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(value);
    final IntegerObject _result;
    synchronized (_createCache_transformValue_1) {
      if (_createCache_transformValue_1.containsKey(_cacheKey)) {
        return _createCache_transformValue_1.get(_cacheKey);
      }
      IntegerObject _createIntegerObject = AmaltheaFactory.eINSTANCE.createIntegerObject();
      _result = _createIntegerObject;
      _createCache_transformValue_1.put(_cacheKey, _result);
    }
    _init_transformValue_1(_result, value);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Value> _createCache_transformValue_1 = CollectionLiterals.newHashMap();
  
  private void _init_transformValue_1(final IntegerObject it, final LiteralInteger value) {
    it.setValue(value.getValue());
  }
  
  private Value _transformValue(final Object value) {
    return null;
  }
  
  private void transformComponentHelper(final org.eclipse.papyrus.amalthea.profile.amalthea.components.Component source, final Component target) {
    final Function1<org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable, EObject> _function = (org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable c) -> {
      return this.transform(c);
    };
    Iterables.<org.eclipse.app4mc.amalthea.model.Runnable>addAll(target.getRunnables(), Iterables.<org.eclipse.app4mc.amalthea.model.Runnable>filter(ListExtensions.<org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable, EObject>map(source.getRunnables(), _function), org.eclipse.app4mc.amalthea.model.Runnable.class));
    final List<EObject> portList = TransformUtil.getAmaltheaFilteredList(source.getBase_Class().getOwnedPorts());
    final Function1<EObject, EObject> _function_1 = (EObject p) -> {
      return this.transform(p);
    };
    Iterables.<Port>addAll(target.getPorts(), Iterables.<Port>filter(ListExtensions.<EObject, EObject>map(portList, _function_1), Port.class));
    this.transformCustomProperties(source.getBase_Class(), target);
  }
  
  private EObject _transform(final org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort port) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(port);
    final FInterfacePort _result;
    synchronized (_createCache_transform_26) {
      if (_createCache_transform_26.containsKey(_cacheKey)) {
        return _createCache_transform_26.get(_cacheKey);
      }
      FInterfacePort _createFInterfacePort = AmaltheaFactory.eINSTANCE.createFInterfacePort();
      _result = _createFInterfacePort;
      _createCache_transform_26.put(_cacheKey, _result);
    }
    _init_transform_26(_result, port);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_26 = CollectionLiterals.newHashMap();
  
  private void _init_transform_26(final FInterfacePort it, final org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort port) {
    it.setName(port.getBase_Port().getName());
    it.setInterfaceName(port.getInterfaceName());
    String kind = "provides";
    boolean _isConjugated = port.getBase_Port().isConjugated();
    if (_isConjugated) {
      kind = "requires";
    }
    it.setKind(InterfaceKind.get(kind));
  }
  
  private EObject _transform(final Composite composite) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(composite);
    final org.eclipse.app4mc.amalthea.model.Composite _result;
    synchronized (_createCache_transform_27) {
      if (_createCache_transform_27.containsKey(_cacheKey)) {
        return _createCache_transform_27.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Composite _createComposite = AmaltheaFactory.eINSTANCE.createComposite();
      _result = _createComposite;
      _createCache_transform_27.put(_cacheKey, _result);
    }
    _init_transform_27(_result, composite);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_27 = CollectionLiterals.newHashMap();
  
  private void _init_transform_27(final org.eclipse.app4mc.amalthea.model.Composite it, final Composite composite) {
    final org.eclipse.uml2.uml.Class base = composite.getBase_Class();
    it.setName(base.getName());
    this.transformComponentHelper(composite, it);
    final Function1<Property, EObject> _function = (Property e) -> {
      return this.transform(e);
    };
    Iterables.<ComponentInstance>addAll(it.getComponentInstances(), Iterables.<ComponentInstance>filter(ListExtensions.<Property, EObject>map(base.getOwnedAttributes(), _function), ComponentInstance.class));
    final Function1<Connector, EObject> _function_1 = (Connector c) -> {
      return this.transform(c);
    };
    final Iterable<org.eclipse.app4mc.amalthea.model.Connector> mappedConnectors = Iterables.<org.eclipse.app4mc.amalthea.model.Connector>filter(ListExtensions.<Connector, EObject>map(base.getOwnedConnectors(), _function_1), org.eclipse.app4mc.amalthea.model.Connector.class);
    Iterables.<org.eclipse.app4mc.amalthea.model.Connector>addAll(it.getConnectors(), mappedConnectors);
  }
  
  private EObject _transform(final Property instance) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(instance);
    final ComponentInstance _result;
    synchronized (_createCache_transform_28) {
      if (_createCache_transform_28.containsKey(_cacheKey)) {
        return _createCache_transform_28.get(_cacheKey);
      }
      ComponentInstance _createComponentInstance = AmaltheaFactory.eINSTANCE.createComponentInstance();
      _result = _createComponentInstance;
      _createCache_transform_28.put(_cacheKey, _result);
    }
    _init_transform_28(_result, instance);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_28 = CollectionLiterals.newHashMap();
  
  private void _init_transform_28(final ComponentInstance it, final Property instance) {
    it.setName(instance.getName());
    Type _type = instance.getType();
    EObject _amaltheaStereotypeApplication = null;
    if (_type!=null) {
      _amaltheaStereotypeApplication=TransformUtil.getAmaltheaStereotypeApplication(_type);
    }
    EObject _transform = null;
    if (_amaltheaStereotypeApplication!=null) {
      _transform=this.transform(_amaltheaStereotypeApplication);
    }
    it.setType(((Component) _transform));
  }
  
  private EObject _transform(final Connector connector) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(connector);
    final org.eclipse.app4mc.amalthea.model.Connector _result;
    synchronized (_createCache_transform_29) {
      if (_createCache_transform_29.containsKey(_cacheKey)) {
        return _createCache_transform_29.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Connector _createConnector = AmaltheaFactory.eINSTANCE.createConnector();
      _result = _createConnector;
      _createCache_transform_29.put(_cacheKey, _result);
    }
    _init_transform_29(_result, connector);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_transform_29 = CollectionLiterals.newHashMap();
  
  private void _init_transform_29(final org.eclipse.app4mc.amalthea.model.Connector it, final Connector connector) {
    it.setName(connector.getName());
    it.setSourcePort(this.transformQaulifiedPort(connector.getEnds().get(0)));
    it.setTargetPort(this.transformQaulifiedPort(connector.getEnds().get(1)));
  }
  
  private QualifiedPort transformQaulifiedPort(final ConnectorEnd end) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(end);
    final QualifiedPort _result;
    synchronized (_createCache_transformQaulifiedPort) {
      if (_createCache_transformQaulifiedPort.containsKey(_cacheKey)) {
        return _createCache_transformQaulifiedPort.get(_cacheKey);
      }
      QualifiedPort _createQualifiedPort = AmaltheaFactory.eINSTANCE.createQualifiedPort();
      _result = _createQualifiedPort;
      _createCache_transformQaulifiedPort.put(_cacheKey, _result);
    }
    _init_transformQaulifiedPort(_result, end);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, QualifiedPort> _createCache_transformQaulifiedPort = CollectionLiterals.newHashMap();
  
  private void _init_transformQaulifiedPort(final QualifiedPort it, final ConnectorEnd end) {
    EObject _amaltheaStereotypeApplication = TransformUtil.getAmaltheaStereotypeApplication(end.getRole());
    EObject _transform = null;
    if (_amaltheaStereotypeApplication!=null) {
      _transform=this.transform(_amaltheaStereotypeApplication);
    }
    it.setPort(((Port) _transform));
    Property _partWithPort = end.getPartWithPort();
    EObject _transform_1 = null;
    if (_partWithPort!=null) {
      _transform_1=this.transform(_partWithPort);
    }
    it.setInstance(((ComponentInstance) _transform_1));
  }
  
  private EObject transform(final Object instance) {
    if (instance instanceof Property) {
      return _transform((Property)instance);
    } else if (instance instanceof Abstraction) {
      return _transform((Abstraction)instance);
    } else if (instance instanceof Connector) {
      return _transform((Connector)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.software.Task) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.software.Task)instance);
    } else if (instance instanceof org.eclipse.uml2.uml.Package) {
      return _transform((org.eclipse.uml2.uml.Package)instance);
    } else if (instance instanceof PackageImport) {
      return _transform((PackageImport)instance);
    } else if (instance instanceof Core) {
      return _transform((Core)instance);
    } else if (instance instanceof ECU) {
      return _transform((ECU)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem)instance);
    } else if (instance instanceof Microcontroller) {
      return _transform((Microcontroller)instance);
    } else if (instance instanceof InterruptController) {
      return _transform((InterruptController)instance);
    } else if (instance instanceof TaskScheduler) {
      return _transform((TaskScheduler)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.software.Label) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.software.Label)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable)instance);
    } else if (instance instanceof Interprocess) {
      return _transform((Interprocess)instance);
    } else if (instance instanceof Periodic) {
      return _transform((Periodic)instance);
    } else if (instance instanceof Single) {
      return _transform((Single)instance);
    } else if (instance instanceof Composite) {
      return _transform((Composite)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement)instance);
    } else if (instance instanceof TimeRequirementLimit) {
      return _transform((TimeRequirementLimit)instance);
    } else if (instance instanceof Bus) {
      return _transform((Bus)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem)instance);
    } else if (instance instanceof InterProcessActivation) {
      return _transform((InterProcessActivation)instance);
    } else if (instance instanceof LabelAccess) {
      return _transform((LabelAccess)instance);
    } else if (instance instanceof RunnableInstructions) {
      return _transform((RunnableInstructions)instance);
    } else if (instance instanceof TaskRunnableCall) {
      return _transform((TaskRunnableCall)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.components.Component) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.components.Component)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType)instance);
    } else if (instance instanceof ECUType) {
      return _transform((ECUType)instance);
    } else if (instance instanceof org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType) {
      return _transform((org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType)instance);
    } else if (instance instanceof SystemType) {
      return _transform((SystemType)instance);
    } else if (instance != null) {
      return _transform(instance);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(instance).toString());
    }
  }
  
  private EObject transformHelper(final EObject network, final Object owner) {
    if (network instanceof Network) {
      return _transformHelper((Network)network, owner);
    } else if (network instanceof Quartz) {
      return _transformHelper((Quartz)network, owner);
    } else if (network instanceof OSEK) {
      return _transformHelper((OSEK)network, owner);
    } else if (network instanceof PriorityBased) {
      return _transformHelper((PriorityBased)network, owner);
    } else if (network instanceof SchedulingHWUnit) {
      return _transformHelper((SchedulingHWUnit)network, owner);
    } else if (network instanceof org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation) {
      return _transformHelper((org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation)network, owner);
    } else if (network instanceof SignedTime) {
      return _transformHelper((SignedTime)network, owner);
    } else if (network instanceof Time) {
      return _transformHelper((Time)network, owner);
    } else if (network instanceof WeibullEstimators) {
      return _transformHelper((WeibullEstimators)network, owner);
    } else if (network instanceof Prescaler) {
      return _transformHelper((Prescaler)network, owner);
    } else if (network instanceof CallSequence) {
      return _transformHelper((CallSequence)network, owner);
    } else if (network instanceof Counter) {
      return _transformHelper((Counter)network, owner);
    } else if (network instanceof Deviation) {
      return _transformHelper((Deviation)network, owner);
    } else if (network instanceof Frequency) {
      return _transformHelper((Frequency)network, owner);
    } else if (network instanceof CallGraph) {
      return _transformHelper((CallGraph)network, owner);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(network, owner).toString());
    }
  }
  
  private BaseObject transformAllocation(final Object isr, final Object controller) {
    if (isr instanceof ISR
         && controller instanceof org.eclipse.app4mc.amalthea.model.InterruptController) {
      return _transformAllocation((ISR)isr, (org.eclipse.app4mc.amalthea.model.InterruptController)controller);
    } else if (isr instanceof Task
         && controller instanceof org.eclipse.app4mc.amalthea.model.TaskScheduler) {
      return _transformAllocation((Task)isr, (org.eclipse.app4mc.amalthea.model.TaskScheduler)controller);
    } else if (isr instanceof org.eclipse.app4mc.amalthea.model.TaskScheduler
         && controller instanceof org.eclipse.app4mc.amalthea.model.Core) {
      return _transformAllocation((org.eclipse.app4mc.amalthea.model.TaskScheduler)isr, (org.eclipse.app4mc.amalthea.model.Core)controller);
    } else if (isr != null
         && controller != null) {
      return _transformAllocation(isr, controller);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(isr, controller).toString());
    }
  }
  
  private Value transformCustomProperty(final CustomProperty custom, final EMap<String, Value> map) {
    if (custom instanceof PortCustomProperty) {
      return _transformCustomProperty((PortCustomProperty)custom, map);
    } else if (custom != null) {
      return _transformCustomProperty(custom, map);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(custom, map).toString());
    }
  }
  
  private Value transformValue(final Object value) {
    if (value instanceof LiteralInteger) {
      return _transformValue((LiteralInteger)value);
    } else if (value instanceof LiteralString) {
      return _transformValue((LiteralString)value);
    } else if (value != null) {
      return _transformValue(value);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(value).toString());
    }
  }
}
