// java wrapper for vtk3DLinearGridCrinkleExtractor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtk3DLinearGridCrinkleExtractor extends vtkDataObjectAlgorithm
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

  private native void SetImplicitFunction_4(vtkImplicitFunction id0);
  public void SetImplicitFunction(vtkImplicitFunction id0)
  {
    SetImplicitFunction_4(id0);
  }

  private native long GetImplicitFunction_5();
  public vtkImplicitFunction GetImplicitFunction()
  {
    long temp = GetImplicitFunction_5();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCopyPointData_6(boolean id0);
  public void SetCopyPointData(boolean id0)
  {
    SetCopyPointData_6(id0);
  }

  private native boolean GetCopyPointData_7();
  public boolean GetCopyPointData()
  {
    return GetCopyPointData_7();
  }

  private native void CopyPointDataOn_8();
  public void CopyPointDataOn()
  {
    CopyPointDataOn_8();
  }

  private native void CopyPointDataOff_9();
  public void CopyPointDataOff()
  {
    CopyPointDataOff_9();
  }

  private native void SetCopyCellData_10(boolean id0);
  public void SetCopyCellData(boolean id0)
  {
    SetCopyCellData_10(id0);
  }

  private native boolean GetCopyCellData_11();
  public boolean GetCopyCellData()
  {
    return GetCopyCellData_11();
  }

  private native void CopyCellDataOn_12();
  public void CopyCellDataOn()
  {
    CopyCellDataOn_12();
  }

  private native void CopyCellDataOff_13();
  public void CopyCellDataOff()
  {
    CopyCellDataOff_13();
  }

  private native void SetRemoveUnusedPoints_14(boolean id0);
  public void SetRemoveUnusedPoints(boolean id0)
  {
    SetRemoveUnusedPoints_14(id0);
  }

  private native boolean GetRemoveUnusedPoints_15();
  public boolean GetRemoveUnusedPoints()
  {
    return GetRemoveUnusedPoints_15();
  }

  private native void RemoveUnusedPointsOn_16();
  public void RemoveUnusedPointsOn()
  {
    RemoveUnusedPointsOn_16();
  }

  private native void RemoveUnusedPointsOff_17();
  public void RemoveUnusedPointsOff()
  {
    RemoveUnusedPointsOff_17();
  }

  private native long GetMTime_18();
  public long GetMTime()
  {
    return GetMTime_18();
  }

  private native void SetOutputPointsPrecision_19(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_19(id0);
  }

  private native int GetOutputPointsPrecision_20();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_20();
  }

  private native void SetSequentialProcessing_21(boolean id0);
  public void SetSequentialProcessing(boolean id0)
  {
    SetSequentialProcessing_21(id0);
  }

  private native boolean GetSequentialProcessing_22();
  public boolean GetSequentialProcessing()
  {
    return GetSequentialProcessing_22();
  }

  private native void SequentialProcessingOn_23();
  public void SequentialProcessingOn()
  {
    SequentialProcessingOn_23();
  }

  private native void SequentialProcessingOff_24();
  public void SequentialProcessingOff()
  {
    SequentialProcessingOff_24();
  }

  private native int GetNumberOfThreadsUsed_25();
  public int GetNumberOfThreadsUsed()
  {
    return GetNumberOfThreadsUsed_25();
  }

  private native boolean CanFullyProcessDataObject_26(vtkDataObject id0);
  public boolean CanFullyProcessDataObject(vtkDataObject id0)
  {
    return CanFullyProcessDataObject_26(id0);
  }

  public vtk3DLinearGridCrinkleExtractor() { super(); }

  public vtk3DLinearGridCrinkleExtractor(long id) { super(id); }
  public native long   VTKInit();

}
