// java wrapper for vtkImageButterworthHighPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageButterworthHighPass extends vtkThreadedImageAlgorithm
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

  private native void SetCutOff_4(double id0,double id1,double id2);
  public void SetCutOff(double id0,double id1,double id2)
  {
    SetCutOff_4(id0,id1,id2);
  }

  private native void SetCutOff_5(double id0[]);
  public void SetCutOff(double id0[])
  {
    SetCutOff_5(id0);
  }

  private native void SetCutOff_6(double id0);
  public void SetCutOff(double id0)
  {
    SetCutOff_6(id0);
  }

  private native void SetXCutOff_7(double id0);
  public void SetXCutOff(double id0)
  {
    SetXCutOff_7(id0);
  }

  private native void SetYCutOff_8(double id0);
  public void SetYCutOff(double id0)
  {
    SetYCutOff_8(id0);
  }

  private native void SetZCutOff_9(double id0);
  public void SetZCutOff(double id0)
  {
    SetZCutOff_9(id0);
  }

  private native double[] GetCutOff_10();
  public double[] GetCutOff()
  {
    return GetCutOff_10();
  }

  private native double GetXCutOff_11();
  public double GetXCutOff()
  {
    return GetXCutOff_11();
  }

  private native double GetYCutOff_12();
  public double GetYCutOff()
  {
    return GetYCutOff_12();
  }

  private native double GetZCutOff_13();
  public double GetZCutOff()
  {
    return GetZCutOff_13();
  }

  private native void SetOrder_14(int id0);
  public void SetOrder(int id0)
  {
    SetOrder_14(id0);
  }

  private native int GetOrder_15();
  public int GetOrder()
  {
    return GetOrder_15();
  }

  public vtkImageButterworthHighPass() { super(); }

  public vtkImageButterworthHighPass(long id) { super(id); }
  public native long   VTKInit();

}
