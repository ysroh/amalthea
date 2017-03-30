package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Bus;
import org.eclipse.app4mc.amalthea.model.BusType;
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.ECU;
import org.eclipse.app4mc.amalthea.model.HardwareTypeDescription;
import org.eclipse.app4mc.amalthea.model.HwSystem;
import org.eclipse.app4mc.amalthea.model.Microcontroller;
import org.eclipse.app4mc.amalthea.model.QType;
import org.eclipse.app4mc.amalthea.model.SchedType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType;
import org.eclipse.papyrus.amalthea.translator.CommonModelTranslator;
import org.eclipse.papyrus.amalthea.util.HWModelUtils;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * @author epp
 */
@SuppressWarnings("all")
public class HWModelTranslator {
  private final CommonModelTranslator commonTranslator = new CommonModelTranslator();
  
  protected EObject _translate(final org.eclipse.uml2.uml.Class element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final ComplexNode _result;
    synchronized (_createCache_translate) {
      if (_createCache_translate.containsKey(_cacheKey)) {
        return _createCache_translate.get(_cacheKey);
      }
      ComplexNode _switchResult = null;
      boolean _matched = false;
      boolean _isHwSystem = HWModelUtils.isHwSystem(element);
      if (_isHwSystem) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createHwSystem();
      }
      if (!_matched) {
        boolean _isECU = HWModelUtils.isECU(element);
        if (_isECU) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createECU();
        }
      }
      if (!_matched) {
        boolean _isMicrocontroller = HWModelUtils.isMicrocontroller(element);
        if (_isMicrocontroller) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createMicrocontroller();
        }
      }
      if (!_matched) {
        boolean _isCore = HWModelUtils.isCore(element);
        if (_isCore) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createCore();
        }
      }
      if (!_matched) {
        boolean _isNetwork = HWModelUtils.isNetwork(element);
        if (_isNetwork) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createNetwork();
        }
      }
      if (!_matched) {
        boolean _isQuartz = HWModelUtils.isQuartz(element);
        if (_isQuartz) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createQuartz();
        }
      }
      _result = _switchResult;
      _createCache_translate.put(_cacheKey, _result);
    }
    _init_translate(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final ComplexNode it, final org.eclipse.uml2.uml.Class element) {
    it.setName(element.getName());
    final org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode node = HWModelUtils.getComplexNode(element);
    Prescaler _prescaler = node.getPrescaler();
    EObject _translate = this.translate(((Element) _prescaler));
    it.setPrescaler(((org.eclipse.app4mc.amalthea.model.Prescaler) _translate));
    final Function1<Quartz, org.eclipse.uml2.uml.Class> _function = (Quartz it_1) -> {
      return it_1.getBase_Class();
    };
    final Function1<org.eclipse.uml2.uml.Class, EObject> _function_1 = (org.eclipse.uml2.uml.Class it_1) -> {
      return this.translate(it_1);
    };
    final Function1<EObject, org.eclipse.app4mc.amalthea.model.Quartz> _function_2 = (EObject it_1) -> {
      return ((org.eclipse.app4mc.amalthea.model.Quartz) it_1);
    };
    it.getQuartzes().addAll(ListExtensions.<EObject, org.eclipse.app4mc.amalthea.model.Quartz>map(ListExtensions.<org.eclipse.uml2.uml.Class, EObject>map(ListExtensions.<Quartz, org.eclipse.uml2.uml.Class>map(node.getQuartzes(), _function), _function_1), _function_2));
    final Function1<Network, org.eclipse.uml2.uml.Class> _function_3 = (Network it_1) -> {
      return it_1.getBase_Class();
    };
    final Function1<org.eclipse.uml2.uml.Class, EObject> _function_4 = (org.eclipse.uml2.uml.Class it_1) -> {
      return this.translate(it_1);
    };
    final Function1<EObject, org.eclipse.app4mc.amalthea.model.Network> _function_5 = (EObject it_1) -> {
      return ((org.eclipse.app4mc.amalthea.model.Network) it_1);
    };
    it.getNetworks().addAll(ListExtensions.<EObject, org.eclipse.app4mc.amalthea.model.Network>map(ListExtensions.<org.eclipse.uml2.uml.Class, EObject>map(ListExtensions.<Network, org.eclipse.uml2.uml.Class>map(node.getNetworks(), _function_3), _function_4), _function_5));
    boolean _matched = false;
    boolean _isHwSystem = HWModelUtils.isHwSystem(element);
    if (_isHwSystem) {
      _matched=true;
      final HwSystem newElement = ((HwSystem) it);
      SystemType _systemType = HWModelUtils.getHwSystem(element).getSystemType();
      EObject _translate_1 = this.translate(((DataType) _systemType));
      newElement.setSystemType(((org.eclipse.app4mc.amalthea.model.SystemType) _translate_1));
    }
    if (!_matched) {
      boolean _isECU = HWModelUtils.isECU(element);
      if (_isECU) {
        _matched=true;
        final ECU newElement_1 = ((ECU) it);
        ECUType _ecuType = HWModelUtils.getECU(element).getEcuType();
        EObject _translate_2 = this.translate(((DataType) _ecuType));
        newElement_1.setEcuType(((org.eclipse.app4mc.amalthea.model.ECUType) _translate_2));
      }
    }
    if (!_matched) {
      boolean _isMicrocontroller = HWModelUtils.isMicrocontroller(element);
      if (_isMicrocontroller) {
        _matched=true;
        final Microcontroller newElement_2 = ((Microcontroller) it);
        MicrocontrollerType _microcontrollerType = HWModelUtils.getMicrocontroller(element).getMicrocontrollerType();
        EObject _translate_3 = this.translate(((DataType) _microcontrollerType));
        newElement_2.setMicrocontrollerType(((org.eclipse.app4mc.amalthea.model.MicrocontrollerType) _translate_3));
      }
    }
    if (!_matched) {
      boolean _isCore = HWModelUtils.isCore(element);
      if (_isCore) {
        _matched=true;
        final Core newElement_3 = ((Core) it);
        CoreType _coreType = HWModelUtils.getCore(element).getCoreType();
        EObject _translate_4 = this.translate(((DataType) _coreType));
        newElement_3.setCoreType(((org.eclipse.app4mc.amalthea.model.CoreType) _translate_4));
      }
    }
    if (!_matched) {
      boolean _isNetwork = HWModelUtils.isNetwork(element);
      if (_isNetwork) {
        _matched=true;
        final org.eclipse.app4mc.amalthea.model.Network newElement_4 = ((org.eclipse.app4mc.amalthea.model.Network) it);
        NetworkType _type = HWModelUtils.getNetwork(element).getType();
        EObject _translate_5 = this.translate(((DataType) _type));
        newElement_4.setType(((org.eclipse.app4mc.amalthea.model.NetworkType) _translate_5));
      }
    }
    if (!_matched) {
      boolean _isQuartz = HWModelUtils.isQuartz(element);
      if (_isQuartz) {
        _matched=true;
        final org.eclipse.app4mc.amalthea.model.Quartz newElement_5 = ((org.eclipse.app4mc.amalthea.model.Quartz) it);
        QType _switchResult_1 = null;
        org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType _type_1 = HWModelUtils.getQuartz(element).getType();
        if (_type_1 != null) {
          switch (_type_1) {
            case DYNAMIC:
              _switchResult_1 = QType.DYNAMIC;
              break;
            case STATIC:
              _switchResult_1 = QType.STATIC;
              break;
            default:
              _switchResult_1 = QType._UNDEFINED_;
              break;
          }
        } else {
          _switchResult_1 = QType._UNDEFINED_;
        }
        newElement_5.setType(_switchResult_1);
        Frequency _frequency = HWModelUtils.getQuartz(element).getFrequency();
        org.eclipse.app4mc.amalthea.model.Frequency _translate_6 = this.commonTranslator.translate(((Element) _frequency));
        newElement_5.setFrequency(((org.eclipse.app4mc.amalthea.model.Frequency) _translate_6));
      }
    }
  }
  
  protected EObject _translate(final DataType element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final HardwareTypeDescription _result;
    synchronized (_createCache_translate_1) {
      if (_createCache_translate_1.containsKey(_cacheKey)) {
        return _createCache_translate_1.get(_cacheKey);
      }
      HardwareTypeDescription _switchResult = null;
      boolean _matched = false;
      boolean _isSystemType = HWModelUtils.isSystemType(element);
      if (_isSystemType) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createSystemType();
      }
      if (!_matched) {
        boolean _isECUType = HWModelUtils.isECUType(element);
        if (_isECUType) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createECUType();
        }
      }
      if (!_matched) {
        boolean _isMicrocontrollerType = HWModelUtils.isMicrocontrollerType(element);
        if (_isMicrocontrollerType) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createMicrocontrollerType();
        }
      }
      if (!_matched) {
        boolean _isCoreType = HWModelUtils.isCoreType(element);
        if (_isCoreType) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createCoreType();
        }
      }
      if (!_matched) {
        boolean _isNetworkType = HWModelUtils.isNetworkType(element);
        if (_isNetworkType) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createNetworkType();
        }
      }
      if (!_matched) {
        boolean _isBus = HWModelUtils.isBus(element);
        if (_isBus) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createBus();
        }
      }
      _result = _switchResult;
      _createCache_translate_1.put(_cacheKey, _result);
    }
    _init_translate_1(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_translate_1 = CollectionLiterals.newHashMap();
  
  private void _init_translate_1(final HardwareTypeDescription it, final DataType element) {
    it.setName(element.getName());
    boolean _matched = false;
    boolean _isCoreType = HWModelUtils.isCoreType(element);
    if (_isCoreType) {
      _matched=true;
      final org.eclipse.app4mc.amalthea.model.CoreType newElement = ((org.eclipse.app4mc.amalthea.model.CoreType) it);
      newElement.setBitWidth(HWModelUtils.getCoreType(element).getBitWidth());
      newElement.setInstructionsPerCycle(HWModelUtils.getCoreType(element).getInstructionsPerCycle());
    }
    if (!_matched) {
      boolean _isNetworkType = HWModelUtils.isNetworkType(element);
      if (_isNetworkType) {
        _matched=true;
        final org.eclipse.app4mc.amalthea.model.NetworkType newElement_1 = ((org.eclipse.app4mc.amalthea.model.NetworkType) it);
        newElement_1.setBitWidth(HWModelUtils.getNetworkType(element).getBitWidth());
        SchedType _switchResult_1 = null;
        org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType _schedPolicy = HWModelUtils.getNetworkType(element).getSchedPolicy();
        if (_schedPolicy != null) {
          switch (_schedPolicy) {
            case RROBIN:
              _switchResult_1 = SchedType.RROBIN;
              break;
            case PRIORITY:
              _switchResult_1 = SchedType.PRIORITY;
              break;
            default:
              _switchResult_1 = SchedType._UNDEFINED_;
              break;
          }
        } else {
          _switchResult_1 = SchedType._UNDEFINED_;
        }
        newElement_1.setSchedPolicy(_switchResult_1);
      }
    }
    if (!_matched) {
      boolean _isBus = HWModelUtils.isBus(element);
      if (_isBus) {
        _matched=true;
        final Bus newElement_2 = ((Bus) it);
        newElement_2.setBitWidth(HWModelUtils.getBus(element).getBitWidth());
        SchedType _switchResult_2 = null;
        org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType _schedPolicy_1 = HWModelUtils.getBus(element).getSchedPolicy();
        if (_schedPolicy_1 != null) {
          switch (_schedPolicy_1) {
            case RROBIN:
              _switchResult_2 = SchedType.RROBIN;
              break;
            case PRIORITY:
              _switchResult_2 = SchedType.PRIORITY;
              break;
            default:
              _switchResult_2 = SchedType._UNDEFINED_;
              break;
          }
        } else {
          _switchResult_2 = SchedType._UNDEFINED_;
        }
        newElement_2.setSchedPolicy(_switchResult_2);
        BusType _switchResult_3 = null;
        org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType _busType = HWModelUtils.getBus(element).getBusType();
        if (_busType != null) {
          switch (_busType) {
            case CAN:
              _switchResult_3 = BusType.CAN;
              break;
            case TTCAN:
              _switchResult_3 = BusType.TTCAN;
              break;
            case LIN:
              _switchResult_3 = BusType.LIN;
              break;
            case FLEXRAY:
              _switchResult_3 = BusType.FLEXRAY;
              break;
            case ETHERNET:
              _switchResult_3 = BusType.ETHERNET;
              break;
            case SPI:
              _switchResult_3 = BusType.SPI;
              break;
            case NA:
              _switchResult_3 = BusType.NA;
              break;
            default:
              _switchResult_3 = BusType._UNDEFINED_;
              break;
          }
        } else {
          _switchResult_3 = BusType._UNDEFINED_;
        }
        newElement_2.setBusType(_switchResult_3);
      }
    }
  }
  
  protected EObject _translate(final Element element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final org.eclipse.app4mc.amalthea.model.Prescaler _result;
    synchronized (_createCache_translate_2) {
      if (_createCache_translate_2.containsKey(_cacheKey)) {
        return _createCache_translate_2.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Prescaler _switchResult = null;
      boolean _matched = false;
      boolean _isPrescaler = HWModelUtils.isPrescaler(element);
      if (_isPrescaler) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createPrescaler();
      }
      _result = _switchResult;
      _createCache_translate_2.put(_cacheKey, _result);
    }
    _init_translate_2(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_translate_2 = CollectionLiterals.newHashMap();
  
  private void _init_translate_2(final org.eclipse.app4mc.amalthea.model.Prescaler it, final Element element) {
    boolean _matched = false;
    boolean _isPrescaler = HWModelUtils.isPrescaler(element);
    if (_isPrescaler) {
      _matched=true;
      final Prescaler prescaler = HWModelUtils.getPrescaler(element);
      it.setName(prescaler.getName());
      it.setClockRatio(prescaler.getClockRatio());
      Quartz _quartz = prescaler.getQuartz();
      EObject _translate = this.translate(((org.eclipse.uml2.uml.Class) _quartz));
      it.setQuartz(((org.eclipse.app4mc.amalthea.model.Quartz) _translate));
    }
  }
  
  public EObject translate(final Element element) {
    if (element instanceof org.eclipse.uml2.uml.Class) {
      return _translate((org.eclipse.uml2.uml.Class)element);
    } else if (element instanceof DataType) {
      return _translate((DataType)element);
    } else if (element != null) {
      return _translate(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}
