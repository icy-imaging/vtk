// java wrapper for vtkCellGridElevation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridElevation extends vtkCellGridAlgorithm
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

  private native void SetAttributeName_4(byte[] id0, int len0);
  public void SetAttributeName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAttributeName_4(bytes0, bytes0.length);
  }

  private native byte[] GetAttributeName_5();
  public String GetAttributeName()
  {
    return new String(GetAttributeName_5(), StandardCharsets.UTF_8);
  }

  private native void SetOrigin_6(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_6(id0,id1,id2);
  }

  private native void SetOrigin_7(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_7(id0);
  }

  private native double[] GetOrigin_8();
  public double[] GetOrigin()
  {
    return GetOrigin_8();
  }

  private native void SetNumberOfAxes_9(int id0);
  public void SetNumberOfAxes(int id0)
  {
    SetNumberOfAxes_9(id0);
  }

  private native int GetNumberOfAxesMinValue_10();
  public int GetNumberOfAxesMinValue()
  {
    return GetNumberOfAxesMinValue_10();
  }

  private native int GetNumberOfAxesMaxValue_11();
  public int GetNumberOfAxesMaxValue()
  {
    return GetNumberOfAxesMaxValue_11();
  }

  private native int GetNumberOfAxes_12();
  public int GetNumberOfAxes()
  {
    return GetNumberOfAxes_12();
  }

  private native void SetAxis_13(double id0,double id1,double id2);
  public void SetAxis(double id0,double id1,double id2)
  {
    SetAxis_13(id0,id1,id2);
  }

  private native void SetAxis_14(double id0[]);
  public void SetAxis(double id0[])
  {
    SetAxis_14(id0);
  }

  private native double[] GetAxis_15();
  public double[] GetAxis()
  {
    return GetAxis_15();
  }

  private native void SetShock_16(double id0);
  public void SetShock(double id0)
  {
    SetShock_16(id0);
  }

  private native double GetShock_17();
  public double GetShock()
  {
    return GetShock_17();
  }

  public vtkCellGridElevation() { super(); }

  public vtkCellGridElevation(long id) { super(id); }
  public native long   VTKInit();

}
