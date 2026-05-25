// java wrapper for vtkRadialGridActor2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRadialGridActor2D extends vtkActor2D
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

  private native int RenderOverlay_4(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_4(id0);
  }

  private native int RenderOpaqueGeometry_5(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_5(id0);
  }

  private native int HasOpaqueGeometry_6();
  public int HasOpaqueGeometry()
  {
    return HasOpaqueGeometry_6();
  }

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  private native void GetActors2D_8(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_8(id0);
  }

  private native void SetTextProperty_9(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_9(id0);
  }

  private native long GetTextProperty_10();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_10();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfAxes_11(int id0);
  public void SetNumberOfAxes(int id0)
  {
    SetNumberOfAxes_11(id0);
  }

  private native int GetNumberOfAxesMinValue_12();
  public int GetNumberOfAxesMinValue()
  {
    return GetNumberOfAxesMinValue_12();
  }

  private native int GetNumberOfAxesMaxValue_13();
  public int GetNumberOfAxesMaxValue()
  {
    return GetNumberOfAxesMaxValue_13();
  }

  private native int GetNumberOfAxes_14();
  public int GetNumberOfAxes()
  {
    return GetNumberOfAxes_14();
  }

  private native void SetStartAngle_15(double id0);
  public void SetStartAngle(double id0)
  {
    SetStartAngle_15(id0);
  }

  private native double GetStartAngle_16();
  public double GetStartAngle()
  {
    return GetStartAngle_16();
  }

  private native void SetEndAngle_17(double id0);
  public void SetEndAngle(double id0)
  {
    SetEndAngle_17(id0);
  }

  private native double GetEndAngle_18();
  public double GetEndAngle()
  {
    return GetEndAngle_18();
  }

  private native void SetOrigin_19(double id0,double id1);
  public void SetOrigin(double id0,double id1)
  {
    SetOrigin_19(id0,id1);
  }

  private native void SetOrigin_20(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_20(id0);
  }

  private native double[] GetOrigin_21();
  public double[] GetOrigin()
  {
    return GetOrigin_21();
  }

  private native void SetNumberOfTicks_22(int id0);
  public void SetNumberOfTicks(int id0)
  {
    SetNumberOfTicks_22(id0);
  }

  private native int GetNumberOfTicksMinValue_23();
  public int GetNumberOfTicksMinValue()
  {
    return GetNumberOfTicksMinValue_23();
  }

  private native int GetNumberOfTicksMaxValue_24();
  public int GetNumberOfTicksMaxValue()
  {
    return GetNumberOfTicksMaxValue_24();
  }

  private native int GetNumberOfTicks_25();
  public int GetNumberOfTicks()
  {
    return GetNumberOfTicks_25();
  }

  private native void SetAxesViewportLength_26(double id0);
  public void SetAxesViewportLength(double id0)
  {
    SetAxesViewportLength_26(id0);
  }

  private native double GetAxesViewportLengthMinValue_27();
  public double GetAxesViewportLengthMinValue()
  {
    return GetAxesViewportLengthMinValue_27();
  }

  private native double GetAxesViewportLengthMaxValue_28();
  public double GetAxesViewportLengthMaxValue()
  {
    return GetAxesViewportLengthMaxValue_28();
  }

  private native double GetAxesViewportLength_29();
  public double GetAxesViewportLength()
  {
    return GetAxesViewportLength_29();
  }

  private native long GetFirstAxesPoints_30();
  public vtkPoints GetFirstAxesPoints()
  {
    long temp = GetFirstAxesPoints_30();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLastAxesPoints_31();
  public vtkPoints GetLastAxesPoints()
  {
    long temp = GetLastAxesPoints_31();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkRadialGridActor2D() { super(); }

  public vtkRadialGridActor2D(long id) { super(id); }
  public native long   VTKInit();

}
