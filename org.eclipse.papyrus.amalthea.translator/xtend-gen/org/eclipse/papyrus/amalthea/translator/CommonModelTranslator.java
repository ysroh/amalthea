package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.amalthea.util.CommonModelUtils;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * @author epp
 */
@SuppressWarnings("all")
public class CommonModelTranslator {
  protected EObject _translate(final Element element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final EObject _result;
    synchronized (_createCache_translate) {
      if (_createCache_translate.containsKey(_cacheKey)) {
        return _createCache_translate.get(_cacheKey);
      }
      EObject _switchResult = null;
      boolean _matched = false;
      boolean _isFrequency = CommonModelUtils.isFrequency(element);
      if (_isFrequency) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createFrequency();
      }
      if (!_matched) {
        boolean _isTime = CommonModelUtils.isTime(element);
        if (_isTime) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createTime();
        }
      }
      _result = _switchResult;
      _createCache_translate.put(_cacheKey, _result);
    }
    _init_translate(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final EObject it, final Element element) {
    boolean _matched = false;
    boolean _isFrequency = CommonModelUtils.isFrequency(element);
    if (_isFrequency) {
      _matched=true;
      final Frequency newElement = ((Frequency) it);
      FrequencyUnit _switchResult_1 = null;
      org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit _unit = CommonModelUtils.getFrequency(element).getUnit();
      if (_unit != null) {
        switch (_unit) {
          case HZ:
            _switchResult_1 = FrequencyUnit.HZ;
            break;
          case KHZ:
            _switchResult_1 = FrequencyUnit.KHZ;
            break;
          case MHZ:
            _switchResult_1 = FrequencyUnit.MHZ;
            break;
          case GHZ:
            _switchResult_1 = FrequencyUnit.GHZ;
            break;
          default:
            _switchResult_1 = FrequencyUnit._UNDEFINED_;
            break;
        }
      } else {
        _switchResult_1 = FrequencyUnit._UNDEFINED_;
      }
      newElement.setUnit(_switchResult_1);
      newElement.setValue(CommonModelUtils.getFrequency(element).getValue());
    }
    if (!_matched) {
      boolean _isTime = CommonModelUtils.isTime(element);
      if (_isTime) {
        _matched=true;
        final Time newElement_1 = ((Time) it);
        newElement_1.setValue(CommonModelUtils.getTime(element).getValue());
        TimeUnit _switchResult_2 = null;
        org.eclipse.papyrus.amalthea.profile.AMALTHEA.TimeUnit _unit_1 = CommonModelUtils.getTime(element).getUnit();
        if (_unit_1 != null) {
          switch (_unit_1) {
            case S:
              _switchResult_2 = TimeUnit.S;
              break;
            case MS:
              _switchResult_2 = TimeUnit.MS;
              break;
            case US:
              _switchResult_2 = TimeUnit.US;
              break;
            case NS:
              _switchResult_2 = TimeUnit.NS;
              break;
            case PS:
              _switchResult_2 = TimeUnit.PS;
              break;
            default:
              _switchResult_2 = TimeUnit._UNDEFINED_;
              break;
          }
        } else {
          _switchResult_2 = TimeUnit._UNDEFINED_;
        }
        newElement_1.setUnit(_switchResult_2);
      }
    }
  }
  
  public EObject translate(final Element element) {
    return _translate(element);
  }
}
