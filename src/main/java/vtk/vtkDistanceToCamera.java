// java wrapper for vtkDistanceToCamera object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDistanceToCamera extends vtkPointSetAlgorithm
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native long GetRenderer_5();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_5();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScreenSize_6(double id0);
  public void SetScreenSize(double id0)
  {
    SetScreenSize_6(id0);
  }

  private native double GetScreenSize_7();
  public double GetScreenSize()
  {
    return GetScreenSize_7();
  }

  private native void SetScaling_8(boolean id0);
  public void SetScaling(boolean id0)
  {
    SetScaling_8(id0);
  }

  private native boolean GetScaling_9();
  public boolean GetScaling()
  {
    return GetScaling_9();
  }

  private native void ScalingOn_10();
  public void ScalingOn()
  {
    ScalingOn_10();
  }

  private native void ScalingOff_11();
  public void ScalingOff()
  {
    ScalingOff_11();
  }

  private native void SetDistanceArrayName_12(byte[] id0, int len0);
  public void SetDistanceArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDistanceArrayName_12(bytes0, bytes0.length);
  }

  private native byte[] GetDistanceArrayName_13();
  public String GetDistanceArrayName()
  {
    return new String(GetDistanceArrayName_13(), StandardCharsets.UTF_8);
  }

  private native long GetMTime_14();
  public long GetMTime()
  {
    return GetMTime_14();
  }

  public vtkDistanceToCamera() { super(); }

  public vtkDistanceToCamera(long id) { super(id); }
  public native long   VTKInit();

}
