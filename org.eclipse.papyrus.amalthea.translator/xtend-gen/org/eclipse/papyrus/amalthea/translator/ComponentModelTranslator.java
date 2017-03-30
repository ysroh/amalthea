package org.eclipse.papyrus.amalthea.translator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.Composite;
import org.eclipse.app4mc.amalthea.model.FInterfacePort;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;
import org.eclipse.papyrus.amalthea.util.ComponentModelUtils;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ComponentModelTranslator {
  public Component translate(final org.eclipse.uml2.uml.Component element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final Component _result;
    synchronized (_createCache_translate) {
      if (_createCache_translate.containsKey(_cacheKey)) {
        return _createCache_translate.get(_cacheKey);
      }
      Component _xifexpression = null;
      boolean _isComposite = ComponentModelUtils.isComposite(element);
      if (_isComposite) {
        _xifexpression = AmaltheaFactory.eINSTANCE.createComposite();
      } else {
        Component _xifexpression_1 = null;
        boolean _isComponent = ComponentModelUtils.isComponent(element);
        if (_isComponent) {
          _xifexpression_1 = AmaltheaFactory.eINSTANCE.createComponent();
        }
        _xifexpression = _xifexpression_1;
      }
      _result = _xifexpression;
      _createCache_translate.put(_cacheKey, _result);
    }
    _init_translate(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Component> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final Component it, final org.eclipse.uml2.uml.Component element) {
    it.setName(element.getName());
    final Function1<Port, FInterfacePort> _function = (Port it_1) -> {
      return this.translate(it_1);
    };
    it.getPorts().addAll(ListExtensions.<Port, FInterfacePort>map(element.getOwnedPorts(), _function));
    boolean _isComposite = ComponentModelUtils.isComposite(element);
    if (_isComposite) {
      final Composite composite = ((Composite) it);
      final Function1<Property, Boolean> _function_1 = (Property it_1) -> {
        return Boolean.valueOf(ComponentModelUtils.isComponentInstance(it_1));
      };
      final Function1<Property, ComponentInstance> _function_2 = (Property it_1) -> {
        return this.translate(it_1);
      };
      Iterables.<ComponentInstance>addAll(composite.getComponentInstances(), IterableExtensions.<Property, ComponentInstance>map(IterableExtensions.<Property>filter(element.getOwnedAttributes(), _function_1), _function_2));
      final Function1<Connector, org.eclipse.app4mc.amalthea.model.Connector> _function_3 = (Connector it_1) -> {
        return this.translate(it_1);
      };
      composite.getConnectors().addAll(ListExtensions.<Connector, org.eclipse.app4mc.amalthea.model.Connector>map(element.getOwnedConnectors(), _function_3));
      final Function1<QualifiedPort, ConnectorEnd> _function_4 = (QualifiedPort it_1) -> {
        return it_1.getBase_ConnectorEnd();
      };
      final Function1<ConnectorEnd, org.eclipse.app4mc.amalthea.model.QualifiedPort> _function_5 = (ConnectorEnd it_1) -> {
        return this.translate(it_1);
      };
      composite.getGroundedPorts().addAll(ListExtensions.<ConnectorEnd, org.eclipse.app4mc.amalthea.model.QualifiedPort>map(ListExtensions.<QualifiedPort, ConnectorEnd>map(ComponentModelUtils.getComposite(element).getGroundedPorts(), _function_4), _function_5));
    }
  }
  
  public FInterfacePort translate(final Port element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final FInterfacePort _result;
    synchronized (_createCache_translate_1) {
      if (_createCache_translate_1.containsKey(_cacheKey)) {
        return _createCache_translate_1.get(_cacheKey);
      }
      FInterfacePort _xifexpression = null;
      boolean _isFInterfacePort = ComponentModelUtils.isFInterfacePort(element);
      if (_isFInterfacePort) {
        _xifexpression = AmaltheaFactory.eINSTANCE.createFInterfacePort();
      }
      _result = _xifexpression;
      _createCache_translate_1.put(_cacheKey, _result);
    }
    _init_translate_1(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, FInterfacePort> _createCache_translate_1 = CollectionLiterals.newHashMap();
  
  private void _init_translate_1(final FInterfacePort it, final Port element) {
    it.setName(element.getName());
  }
  
  public ComponentInstance translate(final Property element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final ComponentInstance _result;
    synchronized (_createCache_translate_2) {
      if (_createCache_translate_2.containsKey(_cacheKey)) {
        return _createCache_translate_2.get(_cacheKey);
      }
      ComponentInstance _xifexpression = null;
      boolean _isComponentInstance = ComponentModelUtils.isComponentInstance(element);
      if (_isComponentInstance) {
        _xifexpression = AmaltheaFactory.eINSTANCE.createComponentInstance();
      }
      _result = _xifexpression;
      _createCache_translate_2.put(_cacheKey, _result);
    }
    _init_translate_2(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, ComponentInstance> _createCache_translate_2 = CollectionLiterals.newHashMap();
  
  private void _init_translate_2(final ComponentInstance it, final Property element) {
    it.setName(element.getName());
    Type _type = element.getType();
    it.setType(this.translate(((org.eclipse.uml2.uml.Component) _type)));
  }
  
  public org.eclipse.app4mc.amalthea.model.Connector translate(final Connector element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final org.eclipse.app4mc.amalthea.model.Connector _result;
    synchronized (_createCache_translate_3) {
      if (_createCache_translate_3.containsKey(_cacheKey)) {
        return _createCache_translate_3.get(_cacheKey);
      }
      _result = AmaltheaFactory.eINSTANCE.createConnector();
      _createCache_translate_3.put(_cacheKey, _result);
    }
    _init_translate_3(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, org.eclipse.app4mc.amalthea.model.Connector> _createCache_translate_3 = CollectionLiterals.newHashMap();
  
  private void _init_translate_3(final org.eclipse.app4mc.amalthea.model.Connector it, final Connector element) {
    ConnectorEnd source = element.getEnds().get(0);
    ConnectorEnd target = element.getEnds().get(1);
    boolean _isConnector = ComponentModelUtils.isConnector(element);
    if (_isConnector) {
      source = ComponentModelUtils.getConnector(element).getSourcePort().getBase_ConnectorEnd();
      target = ComponentModelUtils.getConnector(element).getTargetPort().getBase_ConnectorEnd();
    }
    it.setSourcePort(this.translate(source));
    it.setTargetPort(this.translate(target));
  }
  
  public org.eclipse.app4mc.amalthea.model.QualifiedPort translate(final ConnectorEnd element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final org.eclipse.app4mc.amalthea.model.QualifiedPort _result;
    synchronized (_createCache_translate_4) {
      if (_createCache_translate_4.containsKey(_cacheKey)) {
        return _createCache_translate_4.get(_cacheKey);
      }
      _result = AmaltheaFactory.eINSTANCE.createQualifiedPort();
      _createCache_translate_4.put(_cacheKey, _result);
    }
    _init_translate_4(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, org.eclipse.app4mc.amalthea.model.QualifiedPort> _createCache_translate_4 = CollectionLiterals.newHashMap();
  
  private void _init_translate_4(final org.eclipse.app4mc.amalthea.model.QualifiedPort it, final ConnectorEnd element) {
    it.setInstance(this.translate(element.getPartWithPort()));
    ConnectableElement _role = element.getRole();
    it.setPort(this.translate(((Port) _role)));
  }
}
