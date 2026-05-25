// java wrapper for vtkLoopBooleanPolyDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLoopBooleanPolyDataFilter extends vtkPolyDataAlgorithm
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

  private native int GetNumberOfIntersectionPoints_4();
  public int GetNumberOfIntersectionPoints()
  {
    return GetNumberOfIntersectionPoints_4();
  }

  private native int GetNumberOfIntersectionLines_5();
  public int GetNumberOfIntersectionLines()
  {
    return GetNumberOfIntersectionLines_5();
  }

  private native int GetNoIntersectionOutput_6();
  public int GetNoIntersectionOutput()
  {
    return GetNoIntersectionOutput_6();
  }

  private native void SetNoIntersectionOutput_7(int id0);
  public void SetNoIntersectionOutput(int id0)
  {
    SetNoIntersectionOutput_7(id0);
  }

  private native void NoIntersectionOutputOn_8();
  public void NoIntersectionOutputOn()
  {
    NoIntersectionOutputOn_8();
  }

  private native void NoIntersectionOutputOff_9();
  public void NoIntersectionOutputOff()
  {
    NoIntersectionOutputOff_9();
  }

  private native void SetOperation_10(int id0);
  public void SetOperation(int id0)
  {
    SetOperation_10(id0);
  }

  private native int GetOperationMinValue_11();
  public int GetOperationMinValue()
  {
    return GetOperationMinValue_11();
  }

  private native int GetOperationMaxValue_12();
  public int GetOperationMaxValue()
  {
    return GetOperationMaxValue_12();
  }

  private native int GetOperation_13();
  public int GetOperation()
  {
    return GetOperation_13();
  }

  private native void SetOperationToUnion_14();
  public void SetOperationToUnion()
  {
    SetOperationToUnion_14();
  }

  private native void SetOperationToIntersection_15();
  public void SetOperationToIntersection()
  {
    SetOperationToIntersection_15();
  }

  private native void SetOperationToDifference_16();
  public void SetOperationToDifference()
  {
    SetOperationToDifference_16();
  }

  private native int GetStatus_17();
  public int GetStatus()
  {
    return GetStatus_17();
  }

  private native double GetTolerance_18();
  public double GetTolerance()
  {
    return GetTolerance_18();
  }

  private native void SetTolerance_19(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_19(id0);
  }

  public vtkLoopBooleanPolyDataFilter() { super(); }

  public vtkLoopBooleanPolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
