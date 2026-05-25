// java wrapper for vtkLandmarkTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLandmarkTransform extends vtkLinearTransform
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

  private native void SetSourceLandmarks_4(vtkPoints id0);
  public void SetSourceLandmarks(vtkPoints id0)
  {
    SetSourceLandmarks_4(id0);
  }

  private native void SetTargetLandmarks_5(vtkPoints id0);
  public void SetTargetLandmarks(vtkPoints id0)
  {
    SetTargetLandmarks_5(id0);
  }

  private native long GetSourceLandmarks_6();
  public vtkPoints GetSourceLandmarks()
  {
    long temp = GetSourceLandmarks_6();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTargetLandmarks_7();
  public vtkPoints GetTargetLandmarks()
  {
    long temp = GetTargetLandmarks_7();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMode_8(int id0);
  public void SetMode(int id0)
  {
    SetMode_8(id0);
  }

  private native void SetModeToRigidBody_9();
  public void SetModeToRigidBody()
  {
    SetModeToRigidBody_9();
  }

  private native void SetModeToSimilarity_10();
  public void SetModeToSimilarity()
  {
    SetModeToSimilarity_10();
  }

  private native void SetModeToAffine_11();
  public void SetModeToAffine()
  {
    SetModeToAffine_11();
  }

  private native int GetMode_12();
  public int GetMode()
  {
    return GetMode_12();
  }

  private native byte[] GetModeAsString_13();
  public String GetModeAsString()
  {
    return new String(GetModeAsString_13(), StandardCharsets.UTF_8);
  }

  private native void Inverse_14();
  public void Inverse()
  {
    Inverse_14();
  }

  private native long GetMTime_15();
  public long GetMTime()
  {
    return GetMTime_15();
  }

  private native long MakeTransform_16();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_16();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkLandmarkTransform() { super(); }

  public vtkLandmarkTransform(long id) { super(id); }
  public native long   VTKInit();

}
