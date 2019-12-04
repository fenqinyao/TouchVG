/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiView {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GiView(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiView obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiView(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    touchvgJNI.GiView_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    touchvgJNI.GiView_change_ownership(this, swigCPtr, true);
  }

  public void regenAll(boolean changed) {
    if (getClass() == GiView.class) touchvgJNI.GiView_regenAll(swigCPtr, this, changed); else touchvgJNI.GiView_regenAllSwigExplicitGiView(swigCPtr, this, changed);
  }

  public void regenAppend(int sid, int playh) {
    if (getClass() == GiView.class) touchvgJNI.GiView_regenAppend(swigCPtr, this, sid, playh); else touchvgJNI.GiView_regenAppendSwigExplicitGiView(swigCPtr, this, sid, playh);
  }

  public void redraw(boolean changed) {
    if (getClass() == GiView.class) touchvgJNI.GiView_redraw(swigCPtr, this, changed); else touchvgJNI.GiView_redrawSwigExplicitGiView(swigCPtr, this, changed);
  }

  public boolean useFinger() {
    return (getClass() == GiView.class) ? touchvgJNI.GiView_useFinger(swigCPtr, this) : touchvgJNI.GiView_useFingerSwigExplicitGiView(swigCPtr, this);
  }

  public boolean isContextActionsVisible() {
    return (getClass() == GiView.class) ? touchvgJNI.GiView_isContextActionsVisible(swigCPtr, this) : touchvgJNI.GiView_isContextActionsVisibleSwigExplicitGiView(swigCPtr, this);
  }

  public boolean showContextActions(Ints actions, Floats buttonXY, float x, float y, float w, float h) {
    return (getClass() == GiView.class) ? touchvgJNI.GiView_showContextActions(swigCPtr, this, Ints.getCPtr(actions), actions, Floats.getCPtr(buttonXY), buttonXY, x, y, w, h) : touchvgJNI.GiView_showContextActionsSwigExplicitGiView(swigCPtr, this, Ints.getCPtr(actions), actions, Floats.getCPtr(buttonXY), buttonXY, x, y, w, h);
  }

  public void hideContextActions() {
    if (getClass() == GiView.class) touchvgJNI.GiView_hideContextActions(swigCPtr, this); else touchvgJNI.GiView_hideContextActionsSwigExplicitGiView(swigCPtr, this);
  }

  public void commandChanged() {
    if (getClass() == GiView.class) touchvgJNI.GiView_commandChanged(swigCPtr, this); else touchvgJNI.GiView_commandChangedSwigExplicitGiView(swigCPtr, this);
  }

  public void selectionChanged() {
    if (getClass() == GiView.class) touchvgJNI.GiView_selectionChanged(swigCPtr, this); else touchvgJNI.GiView_selectionChangedSwigExplicitGiView(swigCPtr, this);
  }

  public void contentChanged() {
    if (getClass() == GiView.class) touchvgJNI.GiView_contentChanged(swigCPtr, this); else touchvgJNI.GiView_contentChangedSwigExplicitGiView(swigCPtr, this);
  }

  public void dynamicChanged() {
    if (getClass() == GiView.class) touchvgJNI.GiView_dynamicChanged(swigCPtr, this); else touchvgJNI.GiView_dynamicChangedSwigExplicitGiView(swigCPtr, this);
  }

  public void zoomChanged() {
    if (getClass() == GiView.class) touchvgJNI.GiView_zoomChanged(swigCPtr, this); else touchvgJNI.GiView_zoomChangedSwigExplicitGiView(swigCPtr, this);
  }

  public void viewChanged(GiView oldview) {
    if (getClass() == GiView.class) touchvgJNI.GiView_viewChanged(swigCPtr, this, GiView.getCPtr(oldview), oldview); else touchvgJNI.GiView_viewChangedSwigExplicitGiView(swigCPtr, this, GiView.getCPtr(oldview), oldview);
  }

  public void shapeWillDelete(int sid) {
    if (getClass() == GiView.class) touchvgJNI.GiView_shapeWillDelete(swigCPtr, this, sid); else touchvgJNI.GiView_shapeWillDeleteSwigExplicitGiView(swigCPtr, this, sid);
  }

  public void shapeDeleted(int sid) {
    if (getClass() == GiView.class) touchvgJNI.GiView_shapeDeleted(swigCPtr, this, sid); else touchvgJNI.GiView_shapeDeletedSwigExplicitGiView(swigCPtr, this, sid);
  }

  public boolean shapeDblClick(int type, int sid, int tag) {
    return (getClass() == GiView.class) ? touchvgJNI.GiView_shapeDblClick(swigCPtr, this, type, sid, tag) : touchvgJNI.GiView_shapeDblClickSwigExplicitGiView(swigCPtr, this, type, sid, tag);
  }

  public boolean shapeClicked(int type, int sid, int tag, float x, float y) {
    return (getClass() == GiView.class) ? touchvgJNI.GiView_shapeClicked(swigCPtr, this, type, sid, tag, x, y) : touchvgJNI.GiView_shapeClickedSwigExplicitGiView(swigCPtr, this, type, sid, tag, x, y);
  }

  public void showMessage(String text) {
    if (getClass() == GiView.class) touchvgJNI.GiView_showMessage(swigCPtr, this, text); else touchvgJNI.GiView_showMessageSwigExplicitGiView(swigCPtr, this, text);
  }

  public void getLocalizedString(String name, MgStringCallback c) {
    if (getClass() == GiView.class) touchvgJNI.GiView_getLocalizedString(swigCPtr, this, name, MgStringCallback.getCPtr(c), c); else touchvgJNI.GiView_getLocalizedStringSwigExplicitGiView(swigCPtr, this, name, MgStringCallback.getCPtr(c), c);
  }

  public GiView() {
    this(touchvgJNI.new_GiView(), true);
    touchvgJNI.GiView_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}