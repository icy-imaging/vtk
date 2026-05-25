// java wrapper for vtkOpenGLMoleculeMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLMoleculeMapper extends vtkMoleculeMapper
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

  private native void Render_4(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_4(id0,id1);
  }

  private native void ReleaseGraphicsResources_5(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_5(id0);
  }

  private native long GetFastAtomMapper_6();
  public vtkOpenGLSphereMapper GetFastAtomMapper()
  {
    long temp = GetFastAtomMapper_6();

    if (temp == 0) return null;
    return (vtkOpenGLSphereMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMapScalars_7(boolean id0);
  public void SetMapScalars(boolean id0)
  {
    SetMapScalars_7(id0);
  }

  public vtkOpenGLMoleculeMapper() { super(); }

  public vtkOpenGLMoleculeMapper(long id) { super(id); }
  public native long   VTKInit();

}
