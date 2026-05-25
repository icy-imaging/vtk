// java wrapper for vtkPlaneSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlaneSource extends vtkPolyDataAlgorithm
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

  private native void SetXResolution_4(int id0);
  public void SetXResolution(int id0)
  {
    SetXResolution_4(id0);
  }

  private native int GetXResolution_5();
  public int GetXResolution()
  {
    return GetXResolution_5();
  }

  private native void SetYResolution_6(int id0);
  public void SetYResolution(int id0)
  {
    SetYResolution_6(id0);
  }

  private native int GetYResolution_7();
  public int GetYResolution()
  {
    return GetYResolution_7();
  }

  private native void SetResolution_8(int id0,int id1);
  public void SetResolution(int id0,int id1)
  {
    SetResolution_8(id0,id1);
  }

  private native void SetOrigin_9(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_9(id0,id1,id2);
  }

  private native void SetOrigin_10(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_10(id0);
  }

  private native double[] GetOrigin_11();
  public double[] GetOrigin()
  {
    return GetOrigin_11();
  }

  private native void SetPoint1_12(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_12(id0,id1,id2);
  }

  private native void SetPoint1_13(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_13(id0);
  }

  private native double[] GetPoint1_14();
  public double[] GetPoint1()
  {
    return GetPoint1_14();
  }

  private native void SetPoint2_15(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_15(id0,id1,id2);
  }

  private native void SetPoint2_16(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_16(id0);
  }

  private native double[] GetPoint2_17();
  public double[] GetPoint2()
  {
    return GetPoint2_17();
  }

  private native void GetAxis1_18(double id0[]);
  public void GetAxis1(double id0[])
  {
    GetAxis1_18(id0);
  }

  private native void GetAxis2_19(double id0[]);
  public void GetAxis2(double id0[])
  {
    GetAxis2_19(id0);
  }

  private native void SetCenter_20(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_20(id0,id1,id2);
  }

  private native void SetCenter_21(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_21(id0);
  }

  private native double[] GetCenter_22();
  public double[] GetCenter()
  {
    return GetCenter_22();
  }

  private native void SetNormal_23(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_23(id0,id1,id2);
  }

  private native void SetNormal_24(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_24(id0);
  }

  private native double[] GetNormal_25();
  public double[] GetNormal()
  {
    return GetNormal_25();
  }

  private native void Push_26(double id0);
  public void Push(double id0)
  {
    Push_26(id0);
  }

  private native void Rotate_27(double id0,double id1[]);
  public void Rotate(double id0,double id1[])
  {
    Rotate_27(id0,id1);
  }

  private native void SetOutputPointsPrecision_28(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_28(id0);
  }

  private native int GetOutputPointsPrecision_29();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_29();
  }

  public vtkPlaneSource() { super(); }

  public vtkPlaneSource(long id) { super(id); }
  public native long   VTKInit();

}
