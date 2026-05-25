// java wrapper for vtkMatrixMathFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMatrixMathFilter extends vtkDataSetAlgorithm
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

  private native void SetOperationToDeterminant_6();
  public void SetOperationToDeterminant()
  {
    SetOperationToDeterminant_6();
  }

  private native void SetOperationToEigenvalue_7();
  public void SetOperationToEigenvalue()
  {
    SetOperationToEigenvalue_7();
  }

  private native void SetOperationToEigenvector_8();
  public void SetOperationToEigenvector()
  {
    SetOperationToEigenvector_8();
  }

  private native void SetOperationToInverse_9();
  public void SetOperationToInverse()
  {
    SetOperationToInverse_9();
  }

  public vtkMatrixMathFilter() { super(); }

  public vtkMatrixMathFilter(long id) { super(id); }
  public native long   VTKInit();

}
