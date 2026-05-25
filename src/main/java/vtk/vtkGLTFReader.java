// java wrapper for vtkGLTFReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGLTFReader extends vtkMultiBlockDataSetAlgorithm
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

  private native long GetNumberOfTextures_4();
  public long GetNumberOfTextures()
  {
    return GetNumberOfTextures_4();
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_6();
  public String GetFileName()
  {
    return new String(GetFileName_6(), StandardCharsets.UTF_8);
  }

  private native void SetStream_7(vtkResourceStream id0);
  public void SetStream(vtkResourceStream id0)
  {
    SetStream_7(id0);
  }

  private native long GetStream_8();
  public vtkResourceStream GetStream()
  {
    long temp = GetStream_8();

    if (temp == 0) return null;
    return (vtkResourceStream)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGLBStart_9(long id0);
  public void SetGLBStart(long id0)
  {
    SetGLBStart_9(id0);
  }

  private native long GetGLBStart_10();
  public long GetGLBStart()
  {
    return GetGLBStart_10();
  }

  private native void SetURILoader_11(vtkURILoader id0);
  public void SetURILoader(vtkURILoader id0)
  {
    SetURILoader_11(id0);
  }

  private native long GetURILoader_12();
  public vtkURILoader GetURILoader()
  {
    long temp = GetURILoader_12();

    if (temp == 0) return null;
    return (vtkURILoader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetApplyDeformationsToGeometry_13(boolean id0);
  public void SetApplyDeformationsToGeometry(boolean id0)
  {
    SetApplyDeformationsToGeometry_13(id0);
  }

  private native boolean GetApplyDeformationsToGeometry_14();
  public boolean GetApplyDeformationsToGeometry()
  {
    return GetApplyDeformationsToGeometry_14();
  }

  private native void ApplyDeformationsToGeometryOn_15();
  public void ApplyDeformationsToGeometryOn()
  {
    ApplyDeformationsToGeometryOn_15();
  }

  private native void ApplyDeformationsToGeometryOff_16();
  public void ApplyDeformationsToGeometryOff()
  {
    ApplyDeformationsToGeometryOff_16();
  }

  private native long GetNumberOfAnimations_17();
  public long GetNumberOfAnimations()
  {
    return GetNumberOfAnimations_17();
  }

  private native byte[] GetAnimationName_18(long id0);
  public String GetAnimationName(long id0)
  {
    return new String(GetAnimationName_18(id0), StandardCharsets.UTF_8);
  }

  private native float GetAnimationDuration_19(long id0);
  public float GetAnimationDuration(long id0)
  {
    return GetAnimationDuration_19(id0);
  }

  private native void EnableAnimation_20(long id0);
  public void EnableAnimation(long id0)
  {
    EnableAnimation_20(id0);
  }

  private native void DisableAnimation_21(long id0);
  public void DisableAnimation(long id0)
  {
    DisableAnimation_21(id0);
  }

  private native boolean IsAnimationEnabled_22(long id0);
  public boolean IsAnimationEnabled(long id0)
  {
    return IsAnimationEnabled_22(id0);
  }

  private native byte[] GetSceneName_23(long id0);
  public String GetSceneName(long id0)
  {
    return new String(GetSceneName_23(id0), StandardCharsets.UTF_8);
  }

  private native long GetNumberOfScenes_24();
  public long GetNumberOfScenes()
  {
    return GetNumberOfScenes_24();
  }

  private native long GetCurrentScene_25();
  public long GetCurrentScene()
  {
    return GetCurrentScene_25();
  }

  private native void SetCurrentScene_26(long id0);
  public void SetCurrentScene(long id0)
  {
    SetCurrentScene_26(id0);
  }

  private native void SetScene_27(byte[] id0, int len0);
  public void SetScene(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScene_27(bytes0, bytes0.length);
  }

  private native int GetFrameRate_28();
  public int GetFrameRate()
  {
    return GetFrameRate_28();
  }

  private native void SetFrameRate_29(int id0);
  public void SetFrameRate(int id0)
  {
    SetFrameRate_29(id0);
  }

  private native void SetOutputPointsPrecision_30(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_30(id0);
  }

  private native int GetOutputPointsPrecision_31();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_31();
  }

  private native long GetAllSceneNames_32();
  public vtkStringArray GetAllSceneNames()
  {
    long temp = GetAllSceneNames_32();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAnimationSelection_33();
  public vtkDataArraySelection GetAnimationSelection()
  {
    long temp = GetAnimationSelection_33();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGLTFReader() { super(); }

  public vtkGLTFReader(long id) { super(id); }
  public native long   VTKInit();

}
