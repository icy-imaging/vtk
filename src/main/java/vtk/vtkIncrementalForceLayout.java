// java wrapper for vtkIncrementalForceLayout object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIncrementalForceLayout extends vtkObject
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

  private native void SetGraph_4(vtkGraph id0);
  public void SetGraph(vtkGraph id0)
  {
    SetGraph_4(id0);
  }

  private native long GetGraph_5();
  public vtkGraph GetGraph()
  {
    long temp = GetGraph_5();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFixed_6(long id0);
  public void SetFixed(long id0)
  {
    SetFixed_6(id0);
  }

  private native long GetFixed_7();
  public long GetFixed()
  {
    return GetFixed_7();
  }

  private native void SetAlpha_8(float id0);
  public void SetAlpha(float id0)
  {
    SetAlpha_8(id0);
  }

  private native float GetAlpha_9();
  public float GetAlpha()
  {
    return GetAlpha_9();
  }

  private native void SetTheta_10(float id0);
  public void SetTheta(float id0)
  {
    SetTheta_10(id0);
  }

  private native float GetTheta_11();
  public float GetTheta()
  {
    return GetTheta_11();
  }

  private native void SetCharge_12(float id0);
  public void SetCharge(float id0)
  {
    SetCharge_12(id0);
  }

  private native float GetCharge_13();
  public float GetCharge()
  {
    return GetCharge_13();
  }

  private native void SetStrength_14(float id0);
  public void SetStrength(float id0)
  {
    SetStrength_14(id0);
  }

  private native float GetStrength_15();
  public float GetStrength()
  {
    return GetStrength_15();
  }

  private native void SetDistance_16(float id0);
  public void SetDistance(float id0)
  {
    SetDistance_16(id0);
  }

  private native float GetDistance_17();
  public float GetDistance()
  {
    return GetDistance_17();
  }

  private native void SetGravity_18(float id0);
  public void SetGravity(float id0)
  {
    SetGravity_18(id0);
  }

  private native float GetGravity_19();
  public float GetGravity()
  {
    return GetGravity_19();
  }

  private native void SetFriction_20(float id0);
  public void SetFriction(float id0)
  {
    SetFriction_20(id0);
  }

  private native float GetFriction_21();
  public float GetFriction()
  {
    return GetFriction_21();
  }

  private native void UpdatePositions_22();
  public void UpdatePositions()
  {
    UpdatePositions_22();
  }

  public vtkIncrementalForceLayout() { super(); }

  public vtkIncrementalForceLayout(long id) { super(id); }
  public native long   VTKInit();

}
