// java wrapper for vtkProjectedTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProjectedTexture extends vtkDataSetAlgorithm
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

  private native void SetPosition_4(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_4(id0,id1,id2);
  }

  private native void SetPosition_5(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_5(id0);
  }

  private native double[] GetPosition_6();
  public double[] GetPosition()
  {
    return GetPosition_6();
  }

  private native void SetFocalPoint_7(double id0[]);
  public void SetFocalPoint(double id0[])
  {
    SetFocalPoint_7(id0);
  }

  private native void SetFocalPoint_8(double id0,double id1,double id2);
  public void SetFocalPoint(double id0,double id1,double id2)
  {
    SetFocalPoint_8(id0,id1,id2);
  }

  private native double[] GetFocalPoint_9();
  public double[] GetFocalPoint()
  {
    return GetFocalPoint_9();
  }

  private native void SetCameraMode_10(int id0);
  public void SetCameraMode(int id0)
  {
    SetCameraMode_10(id0);
  }

  private native int GetCameraMode_11();
  public int GetCameraMode()
  {
    return GetCameraMode_11();
  }

  private native void SetCameraModeToPinhole_12();
  public void SetCameraModeToPinhole()
  {
    SetCameraModeToPinhole_12();
  }

  private native void SetCameraModeToTwoMirror_13();
  public void SetCameraModeToTwoMirror()
  {
    SetCameraModeToTwoMirror_13();
  }

  private native void SetMirrorSeparation_14(double id0);
  public void SetMirrorSeparation(double id0)
  {
    SetMirrorSeparation_14(id0);
  }

  private native double GetMirrorSeparation_15();
  public double GetMirrorSeparation()
  {
    return GetMirrorSeparation_15();
  }

  private native double[] GetOrientation_16();
  public double[] GetOrientation()
  {
    return GetOrientation_16();
  }

  private native void SetUp_17(double id0,double id1,double id2);
  public void SetUp(double id0,double id1,double id2)
  {
    SetUp_17(id0,id1,id2);
  }

  private native void SetUp_18(double id0[]);
  public void SetUp(double id0[])
  {
    SetUp_18(id0);
  }

  private native double[] GetUp_19();
  public double[] GetUp()
  {
    return GetUp_19();
  }

  private native void SetAspectRatio_20(double id0,double id1,double id2);
  public void SetAspectRatio(double id0,double id1,double id2)
  {
    SetAspectRatio_20(id0,id1,id2);
  }

  private native void SetAspectRatio_21(double id0[]);
  public void SetAspectRatio(double id0[])
  {
    SetAspectRatio_21(id0);
  }

  private native double[] GetAspectRatio_22();
  public double[] GetAspectRatio()
  {
    return GetAspectRatio_22();
  }

  private native void SetSRange_23(double id0,double id1);
  public void SetSRange(double id0,double id1)
  {
    SetSRange_23(id0,id1);
  }

  private native void SetSRange_24(double id0[]);
  public void SetSRange(double id0[])
  {
    SetSRange_24(id0);
  }

  private native double[] GetSRange_25();
  public double[] GetSRange()
  {
    return GetSRange_25();
  }

  private native void SetTRange_26(double id0,double id1);
  public void SetTRange(double id0,double id1)
  {
    SetTRange_26(id0,id1);
  }

  private native void SetTRange_27(double id0[]);
  public void SetTRange(double id0[])
  {
    SetTRange_27(id0);
  }

  private native double[] GetTRange_28();
  public double[] GetTRange()
  {
    return GetTRange_28();
  }

  public vtkProjectedTexture() { super(); }

  public vtkProjectedTexture(long id) { super(id); }
  public native long   VTKInit();

}
