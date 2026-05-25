// java wrapper for vtkImporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImporter extends vtkObject
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

  private native long GetRenderer_4();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_4();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSceneHierarchy_5();
  public vtkDataAssembly GetSceneHierarchy()
  {
    long temp = GetSceneHierarchy_5();

    if (temp == 0) return null;
    return (vtkDataAssembly)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImportedActors_6();
  public vtkActorCollection GetImportedActors()
  {
    long temp = GetImportedActors_6();

    if (temp == 0) return null;
    return (vtkActorCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImportedCameras_7();
  public vtkCollection GetImportedCameras()
  {
    long temp = GetImportedCameras_7();

    if (temp == 0) return null;
    return (vtkCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImportedLights_8();
  public vtkLightCollection GetImportedLights()
  {
    long temp = GetImportedLights_8();

    if (temp == 0) return null;
    return (vtkLightCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderWindow_9(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_9(id0);
  }

  private native long GetRenderWindow_10();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_10();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean Update_11();
  public boolean Update()
  {
    return Update_11();
  }

  private native void Read_12();
  public void Read()
  {
    Read_12();
  }

  private native byte[] GetOutputsDescription_13();
  public String GetOutputsDescription()
  {
    return new String(GetOutputsDescription_13(), StandardCharsets.UTF_8);
  }

  private native long GetNumberOfAnimations_14();
  public long GetNumberOfAnimations()
  {
    return GetNumberOfAnimations_14();
  }

  private native byte[] GetAnimationName_15(long id0);
  public String GetAnimationName(long id0)
  {
    return new String(GetAnimationName_15(id0), StandardCharsets.UTF_8);
  }

  private native void EnableAnimation_16(long id0);
  public void EnableAnimation(long id0)
  {
    EnableAnimation_16(id0);
  }

  private native void DisableAnimation_17(long id0);
  public void DisableAnimation(long id0)
  {
    DisableAnimation_17(id0);
  }

  private native boolean IsAnimationEnabled_18(long id0);
  public boolean IsAnimationEnabled(long id0)
  {
    return IsAnimationEnabled_18(id0);
  }

  private native long GetNumberOfCameras_19();
  public long GetNumberOfCameras()
  {
    return GetNumberOfCameras_19();
  }

  private native byte[] GetCameraName_20(long id0);
  public String GetCameraName(long id0)
  {
    return new String(GetCameraName_20(id0), StandardCharsets.UTF_8);
  }

  private native void SetCamera_21(long id0);
  public void SetCamera(long id0)
  {
    SetCamera_21(id0);
  }

  private native void UpdateTimeStep_22(double id0);
  public void UpdateTimeStep(double id0)
  {
    UpdateTimeStep_22(id0);
  }

  private native boolean UpdateAtTimeValue_23(double id0);
  public boolean UpdateAtTimeValue(double id0)
  {
    return UpdateAtTimeValue_23(id0);
  }

  public vtkImporter() { super(); }

  public vtkImporter(long id) { super(id); }

}
