// java wrapper for vtkGLTFImporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGLTFImporter extends vtkImporter
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetOutputsDescription_6();
  public String GetOutputsDescription()
  {
    return new String(GetOutputsDescription_6(), StandardCharsets.UTF_8);
  }

  private native boolean UpdateAtTimeValue_7(double id0);
  public boolean UpdateAtTimeValue(double id0)
  {
    return UpdateAtTimeValue_7(id0);
  }

  private native long GetNumberOfAnimations_8();
  public long GetNumberOfAnimations()
  {
    return GetNumberOfAnimations_8();
  }

  private native byte[] GetAnimationName_9(long id0);
  public String GetAnimationName(long id0)
  {
    return new String(GetAnimationName_9(id0), StandardCharsets.UTF_8);
  }

  private native void EnableAnimation_10(long id0);
  public void EnableAnimation(long id0)
  {
    EnableAnimation_10(id0);
  }

  private native void DisableAnimation_11(long id0);
  public void DisableAnimation(long id0)
  {
    DisableAnimation_11(id0);
  }

  private native boolean IsAnimationEnabled_12(long id0);
  public boolean IsAnimationEnabled(long id0)
  {
    return IsAnimationEnabled_12(id0);
  }

  private native long GetNumberOfCameras_13();
  public long GetNumberOfCameras()
  {
    return GetNumberOfCameras_13();
  }

  private native byte[] GetCameraName_14(long id0);
  public String GetCameraName(long id0)
  {
    return new String(GetCameraName_14(id0), StandardCharsets.UTF_8);
  }

  private native void SetCamera_15(long id0);
  public void SetCamera(long id0)
  {
    SetCamera_15(id0);
  }

  public vtkGLTFImporter() { super(); }

  public vtkGLTFImporter(long id) { super(id); }
  public native long   VTKInit();

}
