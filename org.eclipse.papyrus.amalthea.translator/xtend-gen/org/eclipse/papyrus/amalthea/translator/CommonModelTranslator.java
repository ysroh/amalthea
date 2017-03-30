package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.papyrus.amalthea.util.CommonModelUtils;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * @author epp
 */
@SuppressWarnings("all")
public class CommonModelTranslator {
  protected Frequency _translate(final Element element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final Frequency _result;
    synchronized (_createCache_translate) {
      if (_createCache_translate.containsKey(_cacheKey)) {
        return _createCache_translate.get(_cacheKey);
      }
      _result = AmaltheaFactory.eINSTANCE.createFrequency();
      _createCache_translate.put(_cacheKey, _result);
    }
    _init_translate(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Frequency> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final Frequency it, final Element element) {
    FrequencyUnit _switchResult = null;
    org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit _unit = CommonModelUtils.getFrequency(element).getUnit();
    if (_unit != null) {
      switch (_unit) {
        case HZ:
          _switchResult = FrequencyUnit.HZ;
          break;
        case KHZ:
          _switchResult = FrequencyUnit.KHZ;
          break;
        case MHZ:
          _switchResult = FrequencyUnit.MHZ;
          break;
        case GHZ:
          _switchResult = FrequencyUnit.GHZ;
          break;
        default:
          _switchResult = FrequencyUnit._UNDEFINED_;
          break;
      }
    } else {
      _switchResult = FrequencyUnit._UNDEFINED_;
    }
    it.setUnit(_switchResult);
    it.setValue(CommonModelUtils.getFrequency(element).getValue());
  }
  
  public Frequency translate(final Element element) {
    return _translate(element);
  }
}
