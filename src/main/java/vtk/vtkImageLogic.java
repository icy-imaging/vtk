// java wrapper for vtkImageLogic object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageLogic extends vtkThreadedImageAlgorithm
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

  private native void SetOperation_4(int id0);
  public void SetOperation(int id0)
  {
    SetOperation_4(id0);
  }

  private native int GetOperation_5();
  public int GetOperation()
  {
    return GetOperation_5();
  }

  private native void SetOperationToAnd_6();
  public void SetOperationToAnd()
  {
    SetOperationToAnd_6();
  }

  private native void SetOperationToOr_7();
  public void SetOperationToOr()
  {
    SetOperationToOr_7();
  }

  private native void SetOperationToXor_8();
  public void SetOperationToXor()
  {
    SetOperationToXor_8();
  }

  private native void SetOperationToNand_9();
  public void SetOperationToNand()
  {
    SetOperationToNand_9();
  }

  private native void SetOperationToNor_10();
  public void SetOperationToNor()
  {
    SetOperationToNor_10();
  }

  private native void SetOperationToNot_11();
  public void SetOperationToNot()
  {
    SetOperationToNot_11();
  }

  private native void SetOutputTrueValue_12(double id0);
  public void SetOutputTrueValue(double id0)
  {
    SetOutputTrueValue_12(id0);
  }

  private native double GetOutputTrueValue_13();
  public double GetOutputTrueValue()
  {
    return GetOutputTrueValue_13();
  }

  private native void SetInput1Data_14(vtkDataObject id0);
  public void SetInput1Data(vtkDataObject id0)
  {
    SetInput1Data_14(id0);
  }

  private native void SetInput2Data_15(vtkDataObject id0);
  public void SetInput2Data(vtkDataObject id0)
  {
    SetInput2Data_15(id0);
  }

  public vtkImageLogic() { super(); }

  public vtkImageLogic(long id) { super(id); }
  public native long   VTKInit();

}
