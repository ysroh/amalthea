package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.HardwareTypeDescription;
import org.eclipse.app4mc.amalthea.model.Prescaler;
import org.eclipse.emf.ecore.EObject;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isHwSystem is undefined for the type Class"
      + "\nThe method or field isECU is undefined for the type Class"
      + "\nThe method or field isMicrocontroller is undefined for the type Class"
      + "\nThe method or field isCore is undefined for the type Class"
      + "\nThe method or field isNetwork is undefined for the type Class"
      + "\nThe method or field isQuartz is undefined for the type Class");
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final ComplexNode it, final org.eclipse.uml2.uml.Class element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getComplexNode is undefined for the type Class"
      + "\nThe method or field base_Class is undefined"
      + "\nThe method or field base_Class is undefined"
      + "\nThe method or field isHwSystem is undefined for the type Class"
      + "\nThe method or field getHwSystem is undefined for the type Class"
      + "\nThe method or field isECU is undefined for the type Class"
      + "\nThe method or field getECU is undefined for the type Class"
      + "\nThe method or field isMicrocontroller is undefined for the type Class"
      + "\nThe method or field getMicrocontroller is undefined for the type Class"
      + "\nThe method or field isCore is undefined for the type Class"
      + "\nThe method or field getCore is undefined for the type Class"
      + "\nThe method or field isNetwork is undefined for the type Class"
      + "\nThe method or field getNetwork is undefined for the type Class"
      + "\nThe method or field isQuartz is undefined for the type Class"
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isSystemType is undefined for the type DataType"
      + "\nThe method or field isECUType is undefined for the type DataType"
      + "\nThe method or field isMicrocontrollerType is undefined for the type DataType"
      + "\nThe method or field isCoreType is undefined for the type DataType"
      + "\nThe method or field isNetworkType is undefined for the type DataType"
      + "\nThe method or field isBus is undefined for the type DataType");
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_translate_1 = CollectionLiterals.newHashMap();
  
  private void _init_translate_1(final HardwareTypeDescription it, final DataType element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isCoreType is undefined for the type DataType"
      + "\nThe method or field getCoreType is undefined for the type DataType"
      + "\nThe method or field getCoreType is undefined for the type DataType"
      + "\nThe method or field isNetworkType is undefined for the type DataType"
      + "\nThe method or field getNetworkType is undefined for the type DataType"
      + "\nThe method or field getNetworkType is undefined for the type DataType"
      + "\nThe method or field RROBIN is undefined"
      + "\nThe method or field PRIORITY is undefined"
      + "\nThe method or field isBus is undefined for the type DataType"
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isPrescaler is undefined for the type Element");
  }
  
  private final HashMap<ArrayList<?>, EObject> _createCache_translate_2 = CollectionLiterals.newHashMap();
  
  private void _init_translate_2(final Prescaler it, final Element element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isPrescaler is undefined for the type Element"
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
