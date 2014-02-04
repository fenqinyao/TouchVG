/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiCoreView extends MgCoreView {
  private long swigCPtr;

  protected GiCoreView(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.GiCoreView_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiCoreView obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiCoreView(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GiCoreView(GiCoreView mainView) {
    this(touchvgJNI.new_GiCoreView__SWIG_0(GiCoreView.getCPtr(mainView), mainView), true);
  }

  public GiCoreView() {
    this(touchvgJNI.new_GiCoreView__SWIG_1(), true);
  }

  public void createView(GiView view, int type) {
    touchvgJNI.GiCoreView_createView__SWIG_0(swigCPtr, this, GiView.getCPtr(view), view, type);
  }

  public void createView(GiView view) {
    touchvgJNI.GiCoreView_createView__SWIG_1(swigCPtr, this, GiView.getCPtr(view), view);
  }

  public void createMagnifierView(GiView newview, GiView mainView) {
    touchvgJNI.GiCoreView_createMagnifierView(swigCPtr, this, GiView.getCPtr(newview), newview, GiView.getCPtr(mainView), mainView);
  }

  public void destoryView(GiView view) {
    touchvgJNI.GiCoreView_destoryView(swigCPtr, this, GiView.getCPtr(view), view);
  }

  public boolean isDrawing() {
    return touchvgJNI.GiCoreView_isDrawing(swigCPtr, this);
  }

  public int stopDrawing() {
    return touchvgJNI.GiCoreView_stopDrawing(swigCPtr, this);
  }

  public int acquireGraphics(GiView view) {
    return touchvgJNI.GiCoreView_acquireGraphics(swigCPtr, this, GiView.getCPtr(view), view);
  }

  public void releaseGraphics(int hGs) {
    touchvgJNI.GiCoreView_releaseGraphics(swigCPtr, this, hGs);
  }

  public int drawAll(int hDoc, int hGs, GiCanvas canvas) {
    return touchvgJNI.GiCoreView_drawAll__SWIG_0(swigCPtr, this, hDoc, hGs, GiCanvas.getCPtr(canvas), canvas);
  }

  public int drawAppend(int hDoc, int hGs, GiCanvas canvas, int sid) {
    return touchvgJNI.GiCoreView_drawAppend__SWIG_0(swigCPtr, this, hDoc, hGs, GiCanvas.getCPtr(canvas), canvas, sid);
  }

  public int dynDraw(int hShapes, int hGs, GiCanvas canvas) {
    return touchvgJNI.GiCoreView_dynDraw__SWIG_0(swigCPtr, this, hShapes, hGs, GiCanvas.getCPtr(canvas), canvas);
  }

  public int drawAll(GiView view, GiCanvas canvas) {
    return touchvgJNI.GiCoreView_drawAll__SWIG_1(swigCPtr, this, GiView.getCPtr(view), view, GiCanvas.getCPtr(canvas), canvas);
  }

  public int drawAppend(GiView view, GiCanvas canvas, int sid) {
    return touchvgJNI.GiCoreView_drawAppend__SWIG_1(swigCPtr, this, GiView.getCPtr(view), view, GiCanvas.getCPtr(canvas), canvas, sid);
  }

  public int dynDraw(GiView view, GiCanvas canvas) {
    return touchvgJNI.GiCoreView_dynDraw__SWIG_1(swigCPtr, this, GiView.getCPtr(view), view, GiCanvas.getCPtr(canvas), canvas);
  }

  public int setBkColor(GiView view, int argb) {
    return touchvgJNI.GiCoreView_setBkColor(swigCPtr, this, GiView.getCPtr(view), view, argb);
  }

  public static void setScreenDpi(int dpi, float factor) {
    touchvgJNI.GiCoreView_setScreenDpi__SWIG_0(dpi, factor);
  }

  public static void setScreenDpi(int dpi) {
    touchvgJNI.GiCoreView_setScreenDpi__SWIG_1(dpi);
  }

  public void onSize(GiView view, int w, int h) {
    touchvgJNI.GiCoreView_onSize(swigCPtr, this, GiView.getCPtr(view), view, w, h);
  }

  public boolean onGesture(GiView view, GiGestureType type, GiGestureState state, float x, float y, boolean switchGesture) {
    return touchvgJNI.GiCoreView_onGesture__SWIG_0(swigCPtr, this, GiView.getCPtr(view), view, type.swigValue(), state.swigValue(), x, y, switchGesture);
  }

  public boolean onGesture(GiView view, GiGestureType type, GiGestureState state, float x, float y) {
    return touchvgJNI.GiCoreView_onGesture__SWIG_1(swigCPtr, this, GiView.getCPtr(view), view, type.swigValue(), state.swigValue(), x, y);
  }

  public boolean twoFingersMove(GiView view, GiGestureState state, float x1, float y1, float x2, float y2, boolean switchGesture) {
    return touchvgJNI.GiCoreView_twoFingersMove__SWIG_0(swigCPtr, this, GiView.getCPtr(view), view, state.swigValue(), x1, y1, x2, y2, switchGesture);
  }

  public boolean twoFingersMove(GiView view, GiGestureState state, float x1, float y1, float x2, float y2) {
    return touchvgJNI.GiCoreView_twoFingersMove__SWIG_1(swigCPtr, this, GiView.getCPtr(view), view, state.swigValue(), x1, y1, x2, y2);
  }

  public boolean submitBackDoc(GiView view) {
    return touchvgJNI.GiCoreView_submitBackDoc(swigCPtr, this, GiView.getCPtr(view), view);
  }

  public boolean submitDynamicShapes(GiView view) {
    return touchvgJNI.GiCoreView_submitDynamicShapes(swigCPtr, this, GiView.getCPtr(view), view);
  }

  public float calcPenWidth(GiView view, float lineWidth) {
    return touchvgJNI.GiCoreView_calcPenWidth(swigCPtr, this, GiView.getCPtr(view), view, lineWidth);
  }

  public GiGestureType getGestureType() {
    return GiGestureType.swigToEnum(touchvgJNI.GiCoreView_getGestureType(swigCPtr, this));
  }

  public GiGestureState getGestureState() {
    return GiGestureState.swigToEnum(touchvgJNI.GiCoreView_getGestureState(swigCPtr, this));
  }

  public static int getVersion() {
    return touchvgJNI.GiCoreView_getVersion();
  }

  public int exportSVG(int hDoc, int hGs, String filename) {
    return touchvgJNI.GiCoreView_exportSVG__SWIG_0(swigCPtr, this, hDoc, hGs, filename);
  }

  public int exportSVG(GiView view, String filename) {
    return touchvgJNI.GiCoreView_exportSVG__SWIG_1(swigCPtr, this, GiView.getCPtr(view), view, filename);
  }

  public boolean startRecord(String path, int doc, boolean forUndo) {
    return touchvgJNI.GiCoreView_startRecord(swigCPtr, this, path, doc, forUndo);
  }

  public void stopRecord(boolean forUndo) {
    touchvgJNI.GiCoreView_stopRecord(swigCPtr, this, forUndo);
  }

  public boolean recordShapes(boolean forUndo, int tick, int doc, int shapes) {
    return touchvgJNI.GiCoreView_recordShapes(swigCPtr, this, forUndo, tick, doc, shapes);
  }

  public boolean undo(GiView view) {
    return touchvgJNI.GiCoreView_undo(swigCPtr, this, GiView.getCPtr(view), view);
  }

  public boolean redo(GiView view) {
    return touchvgJNI.GiCoreView_redo(swigCPtr, this, GiView.getCPtr(view), view);
  }

  public boolean isPressDragging() {
    return touchvgJNI.GiCoreView_isPressDragging(swigCPtr, this);
  }

  public int viewAdapterHandle() {
    return touchvgJNI.GiCoreView_viewAdapterHandle(swigCPtr, this);
  }

  public int backDoc() {
    return touchvgJNI.GiCoreView_backDoc(swigCPtr, this);
  }

  public int backShapes() {
    return touchvgJNI.GiCoreView_backShapes(swigCPtr, this);
  }

  public int acquireFrontDoc() {
    return touchvgJNI.GiCoreView_acquireFrontDoc(swigCPtr, this);
  }

  public int acquireDynamicShapes() {
    return touchvgJNI.GiCoreView_acquireDynamicShapes(swigCPtr, this);
  }

  public boolean isUndoRecording() {
    return touchvgJNI.GiCoreView_isUndoRecording(swigCPtr, this);
  }

  public boolean isRecording() {
    return touchvgJNI.GiCoreView_isRecording(swigCPtr, this);
  }

  public boolean isPlaying() {
    return touchvgJNI.GiCoreView_isPlaying(swigCPtr, this);
  }

  public int getRecordTick(boolean forUndo) {
    return touchvgJNI.GiCoreView_getRecordTick(swigCPtr, this, forUndo);
  }

  public boolean isUndoLoading() {
    return touchvgJNI.GiCoreView_isUndoLoading(swigCPtr, this);
  }

  public boolean canUndo() {
    return touchvgJNI.GiCoreView_canUndo(swigCPtr, this);
  }

  public boolean canRedo() {
    return touchvgJNI.GiCoreView_canRedo(swigCPtr, this);
  }

  public String getCommand() {
    return touchvgJNI.GiCoreView_getCommand(swigCPtr, this);
  }

  public boolean setCommand(String name, String params) {
    return touchvgJNI.GiCoreView_setCommand__SWIG_0(swigCPtr, this, name, params);
  }

  public boolean setCommand(String name) {
    return touchvgJNI.GiCoreView_setCommand__SWIG_1(swigCPtr, this, name);
  }

  public boolean doContextAction(int action) {
    return touchvgJNI.GiCoreView_doContextAction(swigCPtr, this, action);
  }

  public void clearCachedData() {
    touchvgJNI.GiCoreView_clearCachedData(swigCPtr, this);
  }

  public int addShapesForTest() {
    return touchvgJNI.GiCoreView_addShapesForTest(swigCPtr, this);
  }

  public int getShapeCount() {
    return touchvgJNI.GiCoreView_getShapeCount__SWIG_0(swigCPtr, this);
  }

  public int getShapeCount(int hDoc) {
    return touchvgJNI.GiCoreView_getShapeCount__SWIG_1(swigCPtr, this, hDoc);
  }

  public int getChangeCount() {
    return touchvgJNI.GiCoreView_getChangeCount(swigCPtr, this);
  }

  public int getDrawCount() {
    return touchvgJNI.GiCoreView_getDrawCount(swigCPtr, this);
  }

  public int getSelectedShapeCount() {
    return touchvgJNI.GiCoreView_getSelectedShapeCount(swigCPtr, this);
  }

  public int getSelectedShapeType() {
    return touchvgJNI.GiCoreView_getSelectedShapeType(swigCPtr, this);
  }

  public int getSelectedShapeID() {
    return touchvgJNI.GiCoreView_getSelectedShapeID(swigCPtr, this);
  }

  public void clear() {
    touchvgJNI.GiCoreView_clear(swigCPtr, this);
  }

  public boolean loadFromFile(String vgfile, boolean readOnly) {
    return touchvgJNI.GiCoreView_loadFromFile__SWIG_0(swigCPtr, this, vgfile, readOnly);
  }

  public boolean loadFromFile(String vgfile) {
    return touchvgJNI.GiCoreView_loadFromFile__SWIG_1(swigCPtr, this, vgfile);
  }

  public boolean saveToFile(int hDoc, String vgfile, boolean pretty) {
    return touchvgJNI.GiCoreView_saveToFile__SWIG_0(swigCPtr, this, hDoc, vgfile, pretty);
  }

  public boolean saveToFile(int hDoc, String vgfile) {
    return touchvgJNI.GiCoreView_saveToFile__SWIG_1(swigCPtr, this, hDoc, vgfile);
  }

  public boolean loadShapes(MgStorage s, boolean readOnly) {
    return touchvgJNI.GiCoreView_loadShapes__SWIG_0(swigCPtr, this, MgStorage.getCPtr(s), s, readOnly);
  }

  public boolean loadShapes(MgStorage s) {
    return touchvgJNI.GiCoreView_loadShapes__SWIG_1(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean saveShapes(int hDoc, MgStorage s) {
    return touchvgJNI.GiCoreView_saveShapes(swigCPtr, this, hDoc, MgStorage.getCPtr(s), s);
  }

  public String getContent(int hDoc) {
    return touchvgJNI.GiCoreView_getContent(swigCPtr, this, hDoc);
  }

  public void freeContent() {
    touchvgJNI.GiCoreView_freeContent(swigCPtr, this);
  }

  public boolean setContent(String content) {
    return touchvgJNI.GiCoreView_setContent(swigCPtr, this, content);
  }

  public boolean zoomToExtent() {
    return touchvgJNI.GiCoreView_zoomToExtent(swigCPtr, this);
  }

  public boolean zoomToModel(float x, float y, float w, float h) {
    return touchvgJNI.GiCoreView_zoomToModel(swigCPtr, this, x, y, w, h);
  }

  public GiContext getContext(boolean forChange) {
    return new GiContext(touchvgJNI.GiCoreView_getContext(swigCPtr, this, forChange), false);
  }

  public void setContext(GiContext ctx, int mask, int apply) {
    touchvgJNI.GiCoreView_setContext__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, mask, apply);
  }

  public void setContext(int mask) {
    touchvgJNI.GiCoreView_setContext__SWIG_1(swigCPtr, this, mask);
  }

  public void setContextEditing(boolean editing) {
    touchvgJNI.GiCoreView_setContextEditing(swigCPtr, this, editing);
  }

  public int addImageShape(String name, float width, float height) {
    return touchvgJNI.GiCoreView_addImageShape__SWIG_0(swigCPtr, this, name, width, height);
  }

  public int addImageShape(String name, float xc, float yc, float w, float h) {
    return touchvgJNI.GiCoreView_addImageShape__SWIG_1(swigCPtr, this, name, xc, yc, w, h);
  }

  public boolean getDisplayExtent(Floats box) {
    return touchvgJNI.GiCoreView_getDisplayExtent(swigCPtr, this, Floats.getCPtr(box), box);
  }

  public boolean getBoundingBox(Floats box) {
    return touchvgJNI.GiCoreView_getBoundingBox__SWIG_0(swigCPtr, this, Floats.getCPtr(box), box);
  }

  public boolean getBoundingBox(Floats box, int shapeId) {
    return touchvgJNI.GiCoreView_getBoundingBox__SWIG_1(swigCPtr, this, Floats.getCPtr(box), box, shapeId);
  }

}
