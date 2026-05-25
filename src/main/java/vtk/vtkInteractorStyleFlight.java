// java wrapper for vtkInteractorStyleFlight object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleFlight extends vtkInteractorStyle
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

  private native void JumpTo_4(double id0[],double id1[]);
  public void JumpTo(double id0[],double id1[])
  {
    JumpTo_4(id0,id1);
  }

  private native void SetMotionStepSize_5(double id0);
  public void SetMotionStepSize(double id0)
  {
    SetMotionStepSize_5(id0);
  }

  private native double GetMotionStepSize_6();
  public double GetMotionStepSize()
  {
    return GetMotionStepSize_6();
  }

  private native void SetMotionAccelerationFactor_7(double id0);
  public void SetMotionAccelerationFactor(double id0)
  {
    SetMotionAccelerationFactor_7(id0);
  }

  private native double GetMotionAccelerationFactor_8();
  public double GetMotionAccelerationFactor()
  {
    return GetMotionAccelerationFactor_8();
  }

  private native void SetAngleStepSize_9(double id0);
  public void SetAngleStepSize(double id0)
  {
    SetAngleStepSize_9(id0);
  }

  private native double GetAngleStepSize_10();
  public double GetAngleStepSize()
  {
    return GetAngleStepSize_10();
  }

  private native void SetAngleAccelerationFactor_11(double id0);
  public void SetAngleAccelerationFactor(double id0)
  {
    SetAngleAccelerationFactor_11(id0);
  }

  private native double GetAngleAccelerationFactor_12();
  public double GetAngleAccelerationFactor()
  {
    return GetAngleAccelerationFactor_12();
  }

  private native void SetDisableMotion_13(int id0);
  public void SetDisableMotion(int id0)
  {
    SetDisableMotion_13(id0);
  }

  private native int GetDisableMotion_14();
  public int GetDisableMotion()
  {
    return GetDisableMotion_14();
  }

  private native void DisableMotionOn_15();
  public void DisableMotionOn()
  {
    DisableMotionOn_15();
  }

  private native void DisableMotionOff_16();
  public void DisableMotionOff()
  {
    DisableMotionOff_16();
  }

  private native void SetRestoreUpVector_17(int id0);
  public void SetRestoreUpVector(int id0)
  {
    SetRestoreUpVector_17(id0);
  }

  private native int GetRestoreUpVector_18();
  public int GetRestoreUpVector()
  {
    return GetRestoreUpVector_18();
  }

  private native void RestoreUpVectorOn_19();
  public void RestoreUpVectorOn()
  {
    RestoreUpVectorOn_19();
  }

  private native void RestoreUpVectorOff_20();
  public void RestoreUpVectorOff()
  {
    RestoreUpVectorOff_20();
  }

  private native double[] GetDefaultUpVector_21();
  public double[] GetDefaultUpVector()
  {
    return GetDefaultUpVector_21();
  }

  private native void OnMouseMove_22();
  public void OnMouseMove()
  {
    OnMouseMove_22();
  }

  private native void OnLeftButtonDown_23();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_23();
  }

  private native void OnLeftButtonUp_24();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_24();
  }

  private native void OnMiddleButtonDown_25();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_25();
  }

  private native void OnMiddleButtonUp_26();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_26();
  }

  private native void OnRightButtonDown_27();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_27();
  }

  private native void OnRightButtonUp_28();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_28();
  }

  private native void OnChar_29();
  public void OnChar()
  {
    OnChar_29();
  }

  private native void OnKeyDown_30();
  public void OnKeyDown()
  {
    OnKeyDown_30();
  }

  private native void OnKeyUp_31();
  public void OnKeyUp()
  {
    OnKeyUp_31();
  }

  private native void OnTimer_32();
  public void OnTimer()
  {
    OnTimer_32();
  }

  private native void ForwardFly_33();
  public void ForwardFly()
  {
    ForwardFly_33();
  }

  private native void ReverseFly_34();
  public void ReverseFly()
  {
    ReverseFly_34();
  }

  private native void StartForwardFly_35();
  public void StartForwardFly()
  {
    StartForwardFly_35();
  }

  private native void EndForwardFly_36();
  public void EndForwardFly()
  {
    EndForwardFly_36();
  }

  private native void StartReverseFly_37();
  public void StartReverseFly()
  {
    StartReverseFly_37();
  }

  private native void EndReverseFly_38();
  public void EndReverseFly()
  {
    EndReverseFly_38();
  }

  public vtkInteractorStyleFlight() { super(); }

  public vtkInteractorStyleFlight(long id) { super(id); }
  public native long   VTKInit();

}
