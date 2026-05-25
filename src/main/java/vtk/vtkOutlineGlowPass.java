// java wrapper for vtkOutlineGlowPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOutlineGlowPass extends vtkImageProcessingPass
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

  private native float GetOutlineIntensity_5();
  public float GetOutlineIntensity()
  {
    return GetOutlineIntensity_5();
  }

  private native void SetOutlineIntensity_6(float id0);
  public void SetOutlineIntensity(float id0)
  {
    SetOutlineIntensity_6(id0);
  }

  public vtkOutlineGlowPass() { super(); }

  public vtkOutlineGlowPass(long id) { super(id); }
  public native long   VTKInit();

}
