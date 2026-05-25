// java wrapper for vtkPolarAxesActor2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolarAxesActor2D extends vtkActor2D
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

  private native void SetAxesTextProperty_9(vtkTextProperty id0);
  public void SetAxesTextProperty(vtkTextProperty id0)
  {
    SetAxesTextProperty_9(id0);
  }

  private native long GetAxesTextProperty_10();
  public vtkTextProperty GetAxesTextProperty()
  {
    long temp = GetAxesTextProperty_10();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfAxes_11(int id0);
  public void SetNumberOfAxes(int id0)
  {
    SetNumberOfAxes_11(id0);
  }

  private native int GetNumberOfAxes_12();
  public int GetNumberOfAxes()
  {
    return GetNumberOfAxes_12();
  }

  private native void SetNumberOfAxesTicks_13(int id0);
  public void SetNumberOfAxesTicks(int id0)
  {
    SetNumberOfAxesTicks_13(id0);
  }

  private native int GetNumberOfAxesTicks_14();
  public int GetNumberOfAxesTicks()
  {
    return GetNumberOfAxesTicks_14();
  }

  private native void SetAxesLength_15(double id0);
  public void SetAxesLength(double id0)
  {
    SetAxesLength_15(id0);
  }

  private native double GetAxesLength_16();
  public double GetAxesLength()
  {
    return GetAxesLength_16();
  }

  private native void SetStartAngle_17(double id0);
  public void SetStartAngle(double id0)
  {
    SetStartAngle_17(id0);
  }

  private native double GetStartAngle_18();
  public double GetStartAngle()
  {
    return GetStartAngle_18();
  }

  private native void SetEndAngle_19(double id0);
  public void SetEndAngle(double id0)
  {
    SetEndAngle_19(id0);
  }

  private native double GetEndAngle_20();
  public double GetEndAngle()
  {
    return GetEndAngle_20();
  }

  private native void SetOrigin_21(double id0,double id1);
  public void SetOrigin(double id0,double id1)
  {
    SetOrigin_21(id0,id1);
  }

  private native void SetOrigin_22(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_22(id0);
  }

  private native void GetOrigin_23(double id0[]);
  public void GetOrigin(double id0[])
  {
    GetOrigin_23(id0);
  }

  public vtkPolarAxesActor2D() { super(); }

  public vtkPolarAxesActor2D(long id) { super(id); }
  public native long   VTKInit();

}
