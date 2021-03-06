package org.angularjs.index;

import com.intellij.lang.javascript.psi.JSImplicitElementProvider;
import com.intellij.psi.stubs.StringStubIndexExtension;

/**
 * @author Dennis.Ushakov
 */
public abstract class AngularIndexBase extends StringStubIndexExtension<JSImplicitElementProvider> {
  @Override
  public int getVersion() {
    return AngularIndexUtil.BASE_VERSION;
  }
}
