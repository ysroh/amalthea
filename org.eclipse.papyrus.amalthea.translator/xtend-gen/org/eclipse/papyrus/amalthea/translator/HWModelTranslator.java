package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.HardwareTypeDescription;
import org.eclipse.app4mc.amalthea.model.Prescaler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.amalthea.profile.utils.HWModelUtils;
import org.eclipse.papyrus.amalthea.translator.CommonModelTranslator;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getComplexNode is undefined for the type Class"
      + "\nThe method or field base_Class is undefined"
      + "\nThe method or field base_Class is undefined"
      + "\nThe method or field getHwSystem is undefined for the type Class"
      + "\nThe method or field getECU is undefined for the type Class"
      + "\nThe method or field getMicrocontroller is undefined for the type Class"
      + "\nThe method or field getCore is undefined for the type Class"
      + "\nThe method or field getNetwork is undefined for the type Class"
      + "\nThe method or field getQuartz is undefined for the type Class"
      + "\nThe method or field DYNAMIC is undefined"
      + "\nThe method or field STATIC is undefined"
      + "\nThe method or field getQuartz is undefined for the type Class"
      + "\nprescaler cannot be resolved"
      + "\nquartzes cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nnetworks cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nsystemType cannot be resolved"
      + "\necuType cannot be resolved"
      + "\nmicrocontrollerType cannot be resolved"
      + "\ncoreType cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nfrequency cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getCoreType is undefined for the type DataType"
      + "\nThe method or field getCoreType is undefined for the type DataType"
      + "\nThe method or field getNetworkType is undefined for the type DataType"
      + "\nThe method or field getNetworkType is undefined for the type DataType"
      + "\nThe method or field RROBIN is undefined"
      + "\nThe method or field PRIORITY is undefined"
      + "\nThe method or field getBus is undefined for the type DataType"
      + "\nThe method or field getBus is undefined for the type DataType"
      + "\nThe method or field RROBIN is undefined"
      + "\nThe method or field PRIORITY is undefined"
      + "\nThe method or field getBus is undefined for the type DataType"
      + "\nThe method or field CAN is undefined"
      + "\nThe method or field TTCAN is undefined"
      + "\nThe method or field LIN is undefined"
      + "\nThe method or field FLEXRAY is undefined"
      + "\nThe method or field ETHERNET is undefined"
      + "\nThe method or field SPI is undefined"
      + "\nThe method or field NA is undefined"
      + "\nbitWidth cannot be resolved"
      + "\ninstructionsPerCycle cannot be resolved"
      + "\nbitWidth cannot be resolved"
      + "\nschedPolicy cannot be resolved"
      + "\nbitWidth cannot be resolved"
      + "\nschedPolicy cannot be resolved"
      + "\nbusType cannot be resolved");
  }
  
  protected EObject _translate(final Element element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final Prescaler _result;
    synchronized (_createCache_translate_2) {
      if (_createCache_translate_2.containsKey(_cacheKey)) {
        return _createCache_translate_2.get(_cacheKey);
      }
      Prescaler _switchResult = null;
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
  
  private void _init_translate_2(final Prescaler it, final Element element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getPrescaler is undefined for the type Element"
      + "\nname cannot be resolved"
      + "\nclockRatio cannot be resolved"
      + "\nquartz cannot be resolved");
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
