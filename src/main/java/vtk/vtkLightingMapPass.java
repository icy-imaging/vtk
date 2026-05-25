// java wrapper for vtkLightingMapPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLightingMapPass extends vtkDefaultPass
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

  private native void SetRenderType_4(int id0);
  public void SetRenderType(int id0)
  {
    SetRenderType_4(id0);
  }

  private native int GetRenderType_5();
  public int GetRenderType()
  {
    return GetRenderType_5();
  }

  private native long RENDER_LUMINANCE_6();
  public vtkInformationIntegerKey RENDER_LUMINANCE()
  {
    long temp = RENDER_LUMINANCE_6();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long RENDER_NORMALS_7();
  public vtkInformationIntegerKey RENDER_NORMALS()
  {
    long temp = RENDER_NORMALS_7();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkLightingMapPass() { super(); }

  public vtkLightingMapPass(long id) { super(id); }
  public native long   VTKInit();

}
