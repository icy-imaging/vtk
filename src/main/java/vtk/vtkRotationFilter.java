// java wrapper for vtkRotationFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRotationFilter extends vtkUnstructuredGridAlgorithm
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

  private native void SetAxis_4(int id0);
  public void SetAxis(int id0)
  {
    SetAxis_4(id0);
  }

  private native int GetAxisMinValue_5();
  public int GetAxisMinValue()
  {
    return GetAxisMinValue_5();
  }

  private native int GetAxisMaxValue_6();
  public int GetAxisMaxValue()
  {
    return GetAxisMaxValue_6();
  }

  private native int GetAxis_7();
  public int GetAxis()
  {
    return GetAxis_7();
  }

  private native void SetAxisToX_8();
  public void SetAxisToX()
  {
    SetAxisToX_8();
  }

  private native void SetAxisToY_9();
  public void SetAxisToY()
  {
    SetAxisToY_9();
  }

  private native void SetAxisToZ_10();
  public void SetAxisToZ()
  {
    SetAxisToZ_10();
  }

  private native void SetAngle_11(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_11(id0);
  }

  private native double GetAngle_12();
  public double GetAngle()
  {
    return GetAngle_12();
  }

  private native void SetCenter_13(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_13(id0,id1,id2);
  }

  private native void SetCenter_14(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_14(id0);
  }

  private native double[] GetCenter_15();
  public double[] GetCenter()
  {
    return GetCenter_15();
  }

  private native void SetNumberOfCopies_16(int id0);
  public void SetNumberOfCopies(int id0)
  {
    SetNumberOfCopies_16(id0);
  }

  private native int GetNumberOfCopies_17();
  public int GetNumberOfCopies()
  {
    return GetNumberOfCopies_17();
  }

  private native void SetCopyInput_18(int id0);
  public void SetCopyInput(int id0)
  {
    SetCopyInput_18(id0);
  }

  private native int GetCopyInput_19();
  public int GetCopyInput()
  {
    return GetCopyInput_19();
  }

  private native void CopyInputOn_20();
  public void CopyInputOn()
  {
    CopyInputOn_20();
  }

  private native void CopyInputOff_21();
  public void CopyInputOff()
  {
    CopyInputOff_21();
  }

  public vtkRotationFilter() { super(); }

  public vtkRotationFilter(long id) { super(id); }
  public native long   VTKInit();

}
