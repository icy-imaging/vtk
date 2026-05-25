// java wrapper for vtkSurfaceLICMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSurfaceLICMapper extends vtkOpenGLPolyDataMapper
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native void RenderPiece_5(vtkRenderer id0,vtkActor id1);
  public void RenderPiece(vtkRenderer id0,vtkActor id1)
  {
    RenderPiece_5(id0,id1);
  }

  private native void ShallowCopy_6(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_6(id0);
  }

  private native long GetLICInterface_7();
  public vtkSurfaceLICInterface GetLICInterface()
  {
    long temp = GetLICInterface_7();

    if (temp == 0) return null;
    return (vtkSurfaceLICInterface)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSurfaceLICMapper() { super(); }

  public vtkSurfaceLICMapper(long id) { super(id); }
  public native long   VTKInit();

}
