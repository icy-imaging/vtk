// java wrapper for vtkOpenGLRayCastImageDisplayHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLRayCastImageDisplayHelper extends vtkRayCastImageDisplayHelper
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

  private native void RenderTexture_4(vtkVolume id0,vtkRenderer id1,vtkFixedPointRayCastImage id2,float id3);
  public void RenderTexture(vtkVolume id0,vtkRenderer id1,vtkFixedPointRayCastImage id2,float id3)
  {
    RenderTexture_4(id0,id1,id2,id3);
  }

  private native void ReleaseGraphicsResources_5(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_5(id0);
  }

  public vtkOpenGLRayCastImageDisplayHelper() { super(); }

  public vtkOpenGLRayCastImageDisplayHelper(long id) { super(id); }
  public native long   VTKInit();

}
