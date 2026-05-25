// java wrapper for vtkAvatar object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAvatar extends vtkActor
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

  private native double[] GetHeadPosition_4();
  public double[] GetHeadPosition()
  {
    return GetHeadPosition_4();
  }

  private native void SetHeadPosition_5(double id0,double id1,double id2);
  public void SetHeadPosition(double id0,double id1,double id2)
  {
    SetHeadPosition_5(id0,id1,id2);
  }

  private native void SetHeadPosition_6(double id0[]);
  public void SetHeadPosition(double id0[])
  {
    SetHeadPosition_6(id0);
  }

  private native double[] GetHeadOrientation_7();
  public double[] GetHeadOrientation()
  {
    return GetHeadOrientation_7();
  }

  private native void SetHeadOrientation_8(double id0,double id1,double id2);
  public void SetHeadOrientation(double id0,double id1,double id2)
  {
    SetHeadOrientation_8(id0,id1,id2);
  }

  private native void SetHeadOrientation_9(double id0[]);
  public void SetHeadOrientation(double id0[])
  {
    SetHeadOrientation_9(id0);
  }

  private native double[] GetLeftHandPosition_10();
  public double[] GetLeftHandPosition()
  {
    return GetLeftHandPosition_10();
  }

  private native void SetLeftHandPosition_11(double id0,double id1,double id2);
  public void SetLeftHandPosition(double id0,double id1,double id2)
  {
    SetLeftHandPosition_11(id0,id1,id2);
  }

  private native void SetLeftHandPosition_12(double id0[]);
  public void SetLeftHandPosition(double id0[])
  {
    SetLeftHandPosition_12(id0);
  }

  private native double[] GetLeftHandOrientation_13();
  public double[] GetLeftHandOrientation()
  {
    return GetLeftHandOrientation_13();
  }

  private native void SetLeftHandOrientation_14(double id0,double id1,double id2);
  public void SetLeftHandOrientation(double id0,double id1,double id2)
  {
    SetLeftHandOrientation_14(id0,id1,id2);
  }

  private native void SetLeftHandOrientation_15(double id0[]);
  public void SetLeftHandOrientation(double id0[])
  {
    SetLeftHandOrientation_15(id0);
  }

  private native double[] GetRightHandPosition_16();
  public double[] GetRightHandPosition()
  {
    return GetRightHandPosition_16();
  }

  private native void SetRightHandPosition_17(double id0,double id1,double id2);
  public void SetRightHandPosition(double id0,double id1,double id2)
  {
    SetRightHandPosition_17(id0,id1,id2);
  }

  private native void SetRightHandPosition_18(double id0[]);
  public void SetRightHandPosition(double id0[])
  {
    SetRightHandPosition_18(id0);
  }

  private native double[] GetRightHandOrientation_19();
  public double[] GetRightHandOrientation()
  {
    return GetRightHandOrientation_19();
  }

  private native void SetRightHandOrientation_20(double id0,double id1,double id2);
  public void SetRightHandOrientation(double id0,double id1,double id2)
  {
    SetRightHandOrientation_20(id0,id1,id2);
  }

  private native void SetRightHandOrientation_21(double id0[]);
  public void SetRightHandOrientation(double id0[])
  {
    SetRightHandOrientation_21(id0);
  }

  private native double[] GetUpVector_22();
  public double[] GetUpVector()
  {
    return GetUpVector_22();
  }

  private native void SetUpVector_23(double id0,double id1,double id2);
  public void SetUpVector(double id0,double id1,double id2)
  {
    SetUpVector_23(id0,id1,id2);
  }

  private native void SetUpVector_24(double id0[]);
  public void SetUpVector(double id0[])
  {
    SetUpVector_24(id0);
  }

  private native void SetUseLeftHand_25(boolean id0);
  public void SetUseLeftHand(boolean id0)
  {
    SetUseLeftHand_25(id0);
  }

  private native boolean GetUseLeftHand_26();
  public boolean GetUseLeftHand()
  {
    return GetUseLeftHand_26();
  }

  private native void UseLeftHandOn_27();
  public void UseLeftHandOn()
  {
    UseLeftHandOn_27();
  }

  private native void UseLeftHandOff_28();
  public void UseLeftHandOff()
  {
    UseLeftHandOff_28();
  }

  private native void SetUseRightHand_29(boolean id0);
  public void SetUseRightHand(boolean id0)
  {
    SetUseRightHand_29(id0);
  }

  private native boolean GetUseRightHand_30();
  public boolean GetUseRightHand()
  {
    return GetUseRightHand_30();
  }

  private native void UseRightHandOn_31();
  public void UseRightHandOn()
  {
    UseRightHandOn_31();
  }

  private native void UseRightHandOff_32();
  public void UseRightHandOff()
  {
    UseRightHandOff_32();
  }

  private native void SetShowHandsOnly_33(boolean id0);
  public void SetShowHandsOnly(boolean id0)
  {
    SetShowHandsOnly_33(id0);
  }

  private native boolean GetShowHandsOnly_34();
  public boolean GetShowHandsOnly()
  {
    return GetShowHandsOnly_34();
  }

  private native void ShowHandsOnlyOn_35();
  public void ShowHandsOnlyOn()
  {
    ShowHandsOnlyOn_35();
  }

  private native void ShowHandsOnlyOff_36();
  public void ShowHandsOnlyOff()
  {
    ShowHandsOnlyOff_36();
  }

  public vtkAvatar() { super(); }

  public vtkAvatar(long id) { super(id); }
  public native long   VTKInit();

}
