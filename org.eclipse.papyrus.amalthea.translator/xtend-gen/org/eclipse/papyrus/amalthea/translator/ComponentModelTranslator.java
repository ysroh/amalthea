package org.eclipse.papyrus.amalthea.translator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.Composite;
import org.eclipse.app4mc.amalthea.model.FInterfacePort;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;
import org.eclipse.papyrus.amalthea.util.ComponentModelUtils;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * @author epp
 */
@SuppressWarnings("all")
public class ComponentModelTranslator {
  protected IAnnotatable _translate(final Component element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final org.eclipse.app4mc.amalthea.model.Component _result;
    synchronized (_createCache_translate) {
      if (_createCache_translate.containsKey(_cacheKey)) {
        return _createCache_translate.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Component _switchResult = null;
      boolean _matched = false;
      boolean _isComposite = ComponentModelUtils.isComposite(element);
      if (_isComposite) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createComposite();
      }
      if (!_matched) {
        boolean _isComponent = ComponentModelUtils.isComponent(element);
        if (_isComponent) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createComponent();
        }
      }
      _result = _switchResult;
      _createCache_translate.put(_cacheKey, _result);
    }
    _init_translate(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final org.eclipse.app4mc.amalthea.model.Component it, final Component element) {
    it.setName(element.getName());
    final Function1<Port, IAnnotatable> _function = (Port it_1) -> {
      return this.translate(it_1);
    };
    final Function1<IAnnotatable, org.eclipse.app4mc.amalthea.model.Port> _function_1 = (IAnnotatable it_1) -> {
      return ((org.eclipse.app4mc.amalthea.model.Port) it_1);
    };
    it.getPorts().addAll(ListExtensions.<IAnnotatable, org.eclipse.app4mc.amalthea.model.Port>map(ListExtensions.<Port, IAnnotatable>map(element.getOwnedPorts(), _function), _function_1));
    boolean _isComposite = ComponentModelUtils.isComposite(element);
    if (_isComposite) {
      final Composite composite = ((Composite) it);
      final Function1<Property, Boolean> _function_2 = (Property it_1) -> {
        return Boolean.valueOf(ComponentModelUtils.isComponentInstance(it_1));
      };
      final Function1<Property, IAnnotatable> _function_3 = (Property it_1) -> {
        return this.translate(it_1);
      };
      final Function1<IAnnotatable, ComponentInstance> _function_4 = (IAnnotatable it_1) -> {
        return ((ComponentInstance) it_1);
      };
      Iterables.<ComponentInstance>addAll(composite.getComponentInstances(), IterableExtensions.<IAnnotatable, ComponentInstance>map(IterableExtensions.<Property, IAnnotatable>map(IterableExtensions.<Property>filter(element.getOwnedAttributes(), _function_2), _function_3), _function_4));
      final Function1<Connector, IAnnotatable> _function_5 = (Connector it_1) -> {
        return this.translate(it_1);
      };
      final Function1<IAnnotatable, org.eclipse.app4mc.amalthea.model.Connector> _function_6 = (IAnnotatable it_1) -> {
        return ((org.eclipse.app4mc.amalthea.model.Connector) it_1);
      };
      composite.getConnectors().addAll(ListExtensions.<IAnnotatable, org.eclipse.app4mc.amalthea.model.Connector>map(ListExtensions.<Connector, IAnnotatable>map(element.getOwnedConnectors(), _function_5), _function_6));
      final Function1<QualifiedPort, ConnectorEnd> _function_7 = (QualifiedPort it_1) -> {
        return it_1.getBase_ConnectorEnd();
      };
      final Function1<ConnectorEnd, IAnnotatable> _function_8 = (ConnectorEnd it_1) -> {
        return this.translate(it_1);
      };
      final Function1<IAnnotatable, org.eclipse.app4mc.amalthea.model.QualifiedPort> _function_9 = (IAnnotatable it_1) -> {
        return ((org.eclipse.app4mc.amalthea.model.QualifiedPort) it_1);
      };
      composite.getGroundedPorts().addAll(ListExtensions.<IAnnotatable, org.eclipse.app4mc.amalthea.model.QualifiedPort>map(ListExtensions.<ConnectorEnd, IAnnotatable>map(ListExtensions.<QualifiedPort, ConnectorEnd>map(ComponentModelUtils.getComposite(element).getGroundedPorts(), _function_7), _function_8), _function_9));
    }
  }
  
  protected IAnnotatable _translate(final Port element) {
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
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_1 = CollectionLiterals.newHashMap();
  
  private void _init_translate_1(final FInterfacePort it, final Port element) {
    it.setName(element.getName());
  }
  
  protected IAnnotatable _translate(final Property element) {
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
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_2 = CollectionLiterals.newHashMap();
  
  private void _init_translate_2(final ComponentInstance it, final Property element) {
    it.setName(element.getName());
    Type _type = element.getType();
    IAnnotatable _translate = this.translate(((Component) _type));
    it.setType(((org.eclipse.app4mc.amalthea.model.Component) _translate));
  }
  
  protected IAnnotatable _translate(final Connector element) {
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
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_3 = CollectionLiterals.newHashMap();
  
  private void _init_translate_3(final org.eclipse.app4mc.amalthea.model.Connector it, final Connector element) {
    ConnectorEnd source = element.getEnds().get(0);
    ConnectorEnd target = element.getEnds().get(1);
    boolean _isConnector = ComponentModelUtils.isConnector(element);
    if (_isConnector) {
      source = ComponentModelUtils.getConnector(element).getSourcePort().getBase_ConnectorEnd();
      target = ComponentModelUtils.getConnector(element).getTargetPort().getBase_ConnectorEnd();
    }
    IAnnotatable _translate = this.translate(source);
    it.setSourcePort(((org.eclipse.app4mc.amalthea.model.QualifiedPort) _translate));
    IAnnotatable _translate_1 = this.translate(target);
    it.setTargetPort(((org.eclipse.app4mc.amalthea.model.QualifiedPort) _translate_1));
  }
  
  protected IAnnotatable _translate(final ConnectorEnd element) {
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
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_4 = CollectionLiterals.newHashMap();
  
  private void _init_translate_4(final org.eclipse.app4mc.amalthea.model.QualifiedPort it, final ConnectorEnd element) {
    IAnnotatable _translate = this.translate(element.getPartWithPort());
    it.setInstance(((ComponentInstance) _translate));
    ConnectableElement _role = element.getRole();
    IAnnotatable _translate_1 = this.translate(((Port) _role));
    it.setPort(((org.eclipse.app4mc.amalthea.model.Port) _translate_1));
  }
  
  public IAnnotatable translate(final Element element) {
    if (element instanceof Component) {
      return _translate((Component)element);
    } else if (element instanceof Port) {
      return _translate((Port)element);
    } else if (element instanceof Property) {
      return _translate((Property)element);
    } else if (element instanceof Connector) {
      return _translate((Connector)element);
    } else if (element instanceof ConnectorEnd) {
      return _translate((ConnectorEnd)element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}
