// java wrapper for vtkResliceCursorActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceCursorActor extends vtkProp3D
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

  private native long GetCursorAlgorithm_4();
  public vtkResliceCursorPolyDataAlgorithm GetCursorAlgorithm()
  {
    long temp = GetCursorAlgorithm_4();

    if (temp == 0) return null;
    return (vtkResliceCursorPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOpaqueGeometry_5(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_5(id0);
  }

  private native int HasTranslucentPolygonalGeometry_6();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_6();
  }

  private native void ReleaseGraphicsResources_7(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_7(id0);
  }

  private native long GetMTime_8();
  public long GetMTime()
  {
    return GetMTime_8();
  }

  private native long GetCenterlineProperty_9(int id0);
  public vtkProperty GetCenterlineProperty(int id0)
  {
    long temp = GetCenterlineProperty_9(id0);

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetThickSlabProperty_10(int id0);
  public vtkProperty GetThickSlabProperty(int id0)
  {
    long temp = GetThickSlabProperty_10(id0);

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCenterlineActor_11(int id0);
  public vtkActor GetCenterlineActor(int id0)
  {
    long temp = GetCenterlineActor_11(id0);

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUserMatrix_12(vtkMatrix4x4 id0);
  public void SetUserMatrix(vtkMatrix4x4 id0)
  {
    SetUserMatrix_12(id0);
  }

  public vtkResliceCursorActor() { super(); }

  public vtkResliceCursorActor(long id) { super(id); }
  public native long   VTKInit();

}
