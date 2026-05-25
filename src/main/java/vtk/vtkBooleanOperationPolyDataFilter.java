// java wrapper for vtkBooleanOperationPolyDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBooleanOperationPolyDataFilter extends vtkPolyDataAlgorithm
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

  private native int GetOperationMinValue_5();
  public int GetOperationMinValue()
  {
    return GetOperationMinValue_5();
  }

  private native int GetOperationMaxValue_6();
  public int GetOperationMaxValue()
  {
    return GetOperationMaxValue_6();
  }

  private native int GetOperation_7();
  public int GetOperation()
  {
    return GetOperation_7();
  }

  private native void SetOperationToUnion_8();
  public void SetOperationToUnion()
  {
    SetOperationToUnion_8();
  }

  private native void SetOperationToIntersection_9();
  public void SetOperationToIntersection()
  {
    SetOperationToIntersection_9();
  }

  private native void SetOperationToDifference_10();
  public void SetOperationToDifference()
  {
    SetOperationToDifference_10();
  }

  private native void SetReorientDifferenceCells_11(int id0);
  public void SetReorientDifferenceCells(int id0)
  {
    SetReorientDifferenceCells_11(id0);
  }

  private native int GetReorientDifferenceCells_12();
  public int GetReorientDifferenceCells()
  {
    return GetReorientDifferenceCells_12();
  }

  private native void ReorientDifferenceCellsOn_13();
  public void ReorientDifferenceCellsOn()
  {
    ReorientDifferenceCellsOn_13();
  }

  private native void ReorientDifferenceCellsOff_14();
  public void ReorientDifferenceCellsOff()
  {
    ReorientDifferenceCellsOff_14();
  }

  private native void SetTolerance_15(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_15(id0);
  }

  private native double GetTolerance_16();
  public double GetTolerance()
  {
    return GetTolerance_16();
  }

  public vtkBooleanOperationPolyDataFilter() { super(); }

  public vtkBooleanOperationPolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
