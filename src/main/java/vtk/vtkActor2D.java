// java wrapper for vtkActor2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkActor2D extends vtkProp
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

  private native int RenderTranslucentPolygonalGeometry_6(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_6(id0);
  }

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  private native void SetMapper_8(vtkMapper2D id0);
  public void SetMapper(vtkMapper2D id0)
  {
    SetMapper_8(id0);
  }

  private native long GetMapper_9();
  public vtkMapper2D GetMapper()
  {
    long temp = GetMapper_9();

    if (temp == 0) return null;
    return (vtkMapper2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLayerNumber_10(int id0);
  public void SetLayerNumber(int id0)
  {
    SetLayerNumber_10(id0);
  }

  private native int GetLayerNumber_11();
  public int GetLayerNumber()
  {
    return GetLayerNumber_11();
  }

  private native long GetProperty_12();
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_12();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProperty_13(vtkProperty2D id0);
  public void SetProperty(vtkProperty2D id0)
  {
    SetProperty_13(id0);
  }

  private native long GetPositionCoordinate_14();
  public vtkCoordinate GetPositionCoordinate()
  {
    long temp = GetPositionCoordinate_14();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPosition_15(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_15(id0);
  }

  private native void SetPosition_16(double id0,double id1);
  public void SetPosition(double id0,double id1)
  {
    SetPosition_16(id0,id1);
  }

  private native double[] GetPosition_17();
  public double[] GetPosition()
  {
    return GetPosition_17();
  }

  private native void SetDisplayPosition_18(int id0,int id1);
  public void SetDisplayPosition(int id0,int id1)
  {
    SetDisplayPosition_18(id0,id1);
  }

  private native long GetPosition2Coordinate_19();
  public vtkCoordinate GetPosition2Coordinate()
  {
    long temp = GetPosition2Coordinate_19();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPosition2_20(double id0[]);
  public void SetPosition2(double id0[])
  {
    SetPosition2_20(id0);
  }

  private native void SetPosition2_21(double id0,double id1);
  public void SetPosition2(double id0,double id1)
  {
    SetPosition2_21(id0,id1);
  }

  private native double[] GetPosition2_22();
  public double[] GetPosition2()
  {
    return GetPosition2_22();
  }

  private native void SetWidth_23(double id0);
  public void SetWidth(double id0)
  {
    SetWidth_23(id0);
  }

  private native double GetWidth_24();
  public double GetWidth()
  {
    return GetWidth_24();
  }

  private native void SetHeight_25(double id0);
  public void SetHeight(double id0)
  {
    SetHeight_25(id0);
  }

  private native double GetHeight_26();
  public double GetHeight()
  {
    return GetHeight_26();
  }

  private native long GetMTime_27();
  public long GetMTime()
  {
    return GetMTime_27();
  }

  private native void GetActors2D_28(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_28(id0);
  }

  private native void ShallowCopy_29(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_29(id0);
  }

  private native void ReleaseGraphicsResources_30(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_30(id0);
  }

  private native long GetActualPositionCoordinate_31();
  public vtkCoordinate GetActualPositionCoordinate()
  {
    long temp = GetActualPositionCoordinate_31();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActualPosition2Coordinate_32();
  public vtkCoordinate GetActualPosition2Coordinate()
  {
    long temp = GetActualPosition2Coordinate_32();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkActor2D() { super(); }

  public vtkActor2D(long id) { super(id); }
  public native long   VTKInit();

}
