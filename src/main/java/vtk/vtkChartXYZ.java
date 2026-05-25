// java wrapper for vtkChartXYZ object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChartXYZ extends vtkContextItem
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetAngle_4(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_4(id0);
  }

  private native void SetAroundX_5(boolean id0);
  public void SetAroundX(boolean id0)
  {
    SetAroundX_5(id0);
  }

  private native void SetAnnotationLink_6(vtkAnnotationLink id0);
  public void SetAnnotationLink(vtkAnnotationLink id0)
  {
    SetAnnotationLink_6(id0);
  }

  private native long GetAxis_7(int id0);
  public vtkAxis GetAxis(int id0)
  {
    long temp = GetAxis_7(id0);

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxis_8(int id0,vtkAxis id1);
  public void SetAxis(int id0,vtkAxis id1)
  {
    SetAxis_8(id0,id1);
  }

  private native long GetAxesTextProperty_9();
  public vtkTextProperty GetAxesTextProperty()
  {
    long temp = GetAxesTextProperty_9();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxisLabel_10(byte[] id0, int len0);
  public void SetXAxisLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXAxisLabel_10(bytes0, bytes0.length);
  }

  private native void SetYAxisLabel_11(byte[] id0, int len0);
  public void SetYAxisLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYAxisLabel_11(bytes0, bytes0.length);
  }

  private native void SetZAxisLabel_12(byte[] id0, int len0);
  public void SetZAxisLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZAxisLabel_12(bytes0, bytes0.length);
  }

  private native void SetEnsureOuterEdgeAxisLabelling_13(boolean id0);
  public void SetEnsureOuterEdgeAxisLabelling(boolean id0)
  {
    SetEnsureOuterEdgeAxisLabelling_13(id0);
  }

  private native void SetAutoRotate_14(boolean id0);
  public void SetAutoRotate(boolean id0)
  {
    SetAutoRotate_14(id0);
  }

  private native void SetDecorateAxes_15(boolean id0);
  public void SetDecorateAxes(boolean id0)
  {
    SetDecorateAxes_15(id0);
  }

  private native void SetFitToScene_16(boolean id0);
  public void SetFitToScene(boolean id0)
  {
    SetFitToScene_16(id0);
  }

  private native void Update_17();
  public void Update()
  {
    Update_17();
  }

  private native boolean Paint_18(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_18(id0);
  }

  private native long AddPlot_19(vtkPlot3D id0);
  public long AddPlot(vtkPlot3D id0)
  {
    return AddPlot_19(id0);
  }

  private native boolean RemovePlot_20(vtkPlot3D id0);
  public boolean RemovePlot(vtkPlot3D id0)
  {
    return RemovePlot_20(id0);
  }

  private native void ClearPlots_21();
  public void ClearPlots()
  {
    ClearPlots_21();
  }

  private native void RecalculateBounds_22();
  public void RecalculateBounds()
  {
    RecalculateBounds_22();
  }

  private native void RecalculateTransform_23();
  public void RecalculateTransform()
  {
    RecalculateTransform_23();
  }

  private native void SetClippingPlanesEnabled_24(boolean id0);
  public void SetClippingPlanesEnabled(boolean id0)
  {
    SetClippingPlanesEnabled_24(id0);
  }

  private native boolean GetClippingPlanesEnabled_25();
  public boolean GetClippingPlanesEnabled()
  {
    return GetClippingPlanesEnabled_25();
  }

  private native void SetScaleBoxWithPlot_26(boolean id0);
  public void SetScaleBoxWithPlot(boolean id0)
  {
    SetScaleBoxWithPlot_26(id0);
  }

  private native boolean GetScaleBoxWithPlot_27();
  public boolean GetScaleBoxWithPlot()
  {
    return GetScaleBoxWithPlot_27();
  }

  public vtkChartXYZ() { super(); }

  public vtkChartXYZ(long id) { super(id); }
  public native long   VTKInit();

}
