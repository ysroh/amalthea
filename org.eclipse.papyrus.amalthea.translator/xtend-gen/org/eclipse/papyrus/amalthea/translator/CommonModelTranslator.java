package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.amalthea.profile.utils.CommonModelUtils;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getFrequency is undefined for the type Element"
      + "\nThe method or field FrequencyUnit is undefined"
      + "\nThe method or field FrequencyUnit is undefined"
      + "\nThe method or field FrequencyUnit is undefined"
      + "\nThe method or field FrequencyUnit is undefined"
      + "\nThe method or field getFrequency is undefined for the type Element"
      + "\nThe method or field getTime is undefined for the type Element"
      + "\nThe method or field getTime is undefined for the type Element"
      + "\nThe method or field TimeUnit is undefined"
      + "\nThe method or field TimeUnit is undefined"
      + "\nThe method or field TimeUnit is undefined"
      + "\nThe method or field TimeUnit is undefined"
      + "\nThe method or field TimeUnit is undefined"
      + "\nunit cannot be resolved"
      + "\nHZ cannot be resolved"
      + "\nKHZ cannot be resolved"
      + "\nMHZ cannot be resolved"
      + "\nGHZ cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nunit cannot be resolved"
      + "\nS cannot be resolved"
      + "\nMS cannot be resolved"
      + "\nUS cannot be resolved"
      + "\nNS cannot be resolved"
      + "\nPS cannot be resolved");
  }
  
  public EObject translate(final Element element) {
    return _translate(element);
  }
}
