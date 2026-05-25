// java wrapper for vtkImprintFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImprintFilter extends vtkPolyDataAlgorithm
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

  private native void SetTargetConnection_4(vtkAlgorithmOutput id0);
  public void SetTargetConnection(vtkAlgorithmOutput id0)
  {
    SetTargetConnection_4(id0);
  }

  private native long GetTargetConnection_5();
  public vtkAlgorithmOutput GetTargetConnection()
  {
    long temp = GetTargetConnection_5();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTargetData_6(vtkDataObject id0);
  public void SetTargetData(vtkDataObject id0)
  {
    SetTargetData_6(id0);
  }

  private native long GetTarget_7();
  public vtkDataObject GetTarget()
  {
    long temp = GetTarget_7();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImprintConnection_8(vtkAlgorithmOutput id0);
  public void SetImprintConnection(vtkAlgorithmOutput id0)
  {
    SetImprintConnection_8(id0);
  }

  private native long GetImprintConnection_9();
  public vtkAlgorithmOutput GetImprintConnection()
  {
    long temp = GetImprintConnection_9();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImprintData_10(vtkDataObject id0);
  public void SetImprintData(vtkDataObject id0)
  {
    SetImprintData_10(id0);
  }

  private native long GetImprint_11();
  public vtkDataObject GetImprint()
  {
    long temp = GetImprint_11();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_12(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_12(id0);
  }

  private native double GetToleranceMinValue_13();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_13();
  }

  private native double GetToleranceMaxValue_14();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_14();
  }

  private native double GetTolerance_15();
  public double GetTolerance()
  {
    return GetTolerance_15();
  }

  private native void SetMergeToleranceType_16(int id0);
  public void SetMergeToleranceType(int id0)
  {
    SetMergeToleranceType_16(id0);
  }

  private native int GetMergeToleranceTypeMinValue_17();
  public int GetMergeToleranceTypeMinValue()
  {
    return GetMergeToleranceTypeMinValue_17();
  }

  private native int GetMergeToleranceTypeMaxValue_18();
  public int GetMergeToleranceTypeMaxValue()
  {
    return GetMergeToleranceTypeMaxValue_18();
  }

  private native int GetMergeToleranceType_19();
  public int GetMergeToleranceType()
  {
    return GetMergeToleranceType_19();
  }

  private native void SetMergeToleranceTypeToAbsolute_20();
  public void SetMergeToleranceTypeToAbsolute()
  {
    SetMergeToleranceTypeToAbsolute_20();
  }

  private native void SetMergeToleranceTypeToRelativeToProjection_21();
  public void SetMergeToleranceTypeToRelativeToProjection()
  {
    SetMergeToleranceTypeToRelativeToProjection_21();
  }

  private native void SetMergeToleranceTypeToMinEdge_22();
  public void SetMergeToleranceTypeToMinEdge()
  {
    SetMergeToleranceTypeToMinEdge_22();
  }

  private native void SetMergeToleranceTypeToAverageEdge_23();
  public void SetMergeToleranceTypeToAverageEdge()
  {
    SetMergeToleranceTypeToAverageEdge_23();
  }

  private native void SetMergeTolerance_24(double id0);
  public void SetMergeTolerance(double id0)
  {
    SetMergeTolerance_24(id0);
  }

  private native double GetMergeToleranceMinValue_25();
  public double GetMergeToleranceMinValue()
  {
    return GetMergeToleranceMinValue_25();
  }

  private native double GetMergeToleranceMaxValue_26();
  public double GetMergeToleranceMaxValue()
  {
    return GetMergeToleranceMaxValue_26();
  }

  private native double GetMergeTolerance_27();
  public double GetMergeTolerance()
  {
    return GetMergeTolerance_27();
  }

  private native void SetToleranceStrategy_28(int id0);
  public void SetToleranceStrategy(int id0)
  {
    SetToleranceStrategy_28(id0);
  }

  private native int GetToleranceStrategyMinValue_29();
  public int GetToleranceStrategyMinValue()
  {
    return GetToleranceStrategyMinValue_29();
  }

  private native int GetToleranceStrategyMaxValue_30();
  public int GetToleranceStrategyMaxValue()
  {
    return GetToleranceStrategyMaxValue_30();
  }

  private native int GetToleranceStrategy_31();
  public int GetToleranceStrategy()
  {
    return GetToleranceStrategy_31();
  }

  private native void SetToleranceStrategyToDecoupled_32();
  public void SetToleranceStrategyToDecoupled()
  {
    SetToleranceStrategyToDecoupled_32();
  }

  private native void SetToleranceStrategyToLinked_33();
  public void SetToleranceStrategyToLinked()
  {
    SetToleranceStrategyToLinked_33();
  }

  private native void SetOutputType_34(int id0);
  public void SetOutputType(int id0)
  {
    SetOutputType_34(id0);
  }

  private native int GetOutputTypeMinValue_35();
  public int GetOutputTypeMinValue()
  {
    return GetOutputTypeMinValue_35();
  }

  private native int GetOutputTypeMaxValue_36();
  public int GetOutputTypeMaxValue()
  {
    return GetOutputTypeMaxValue_36();
  }

  private native int GetOutputType_37();
  public int GetOutputType()
  {
    return GetOutputType_37();
  }

  private native void SetOutputTypeToTargetCells_38();
  public void SetOutputTypeToTargetCells()
  {
    SetOutputTypeToTargetCells_38();
  }

  private native void SetOutputTypeToImprintedCells_39();
  public void SetOutputTypeToImprintedCells()
  {
    SetOutputTypeToImprintedCells_39();
  }

  private native void SetOutputTypeToProjectedImprint_40();
  public void SetOutputTypeToProjectedImprint()
  {
    SetOutputTypeToProjectedImprint_40();
  }

  private native void SetOutputTypeToImprintedRegion_41();
  public void SetOutputTypeToImprintedRegion()
  {
    SetOutputTypeToImprintedRegion_41();
  }

  private native void SetOutputTypeToMergedImprint_42();
  public void SetOutputTypeToMergedImprint()
  {
    SetOutputTypeToMergedImprint_42();
  }

  private native void SetBoundaryEdgeInsertion_43(boolean id0);
  public void SetBoundaryEdgeInsertion(boolean id0)
  {
    SetBoundaryEdgeInsertion_43(id0);
  }

  private native boolean GetBoundaryEdgeInsertion_44();
  public boolean GetBoundaryEdgeInsertion()
  {
    return GetBoundaryEdgeInsertion_44();
  }

  private native void BoundaryEdgeInsertionOn_45();
  public void BoundaryEdgeInsertionOn()
  {
    BoundaryEdgeInsertionOn_45();
  }

  private native void BoundaryEdgeInsertionOff_46();
  public void BoundaryEdgeInsertionOff()
  {
    BoundaryEdgeInsertionOff_46();
  }

  private native void SetPassCellData_47(boolean id0);
  public void SetPassCellData(boolean id0)
  {
    SetPassCellData_47(id0);
  }

  private native boolean GetPassCellData_48();
  public boolean GetPassCellData()
  {
    return GetPassCellData_48();
  }

  private native void PassCellDataOn_49();
  public void PassCellDataOn()
  {
    PassCellDataOn_49();
  }

  private native void PassCellDataOff_50();
  public void PassCellDataOff()
  {
    PassCellDataOff_50();
  }

  private native void SetPassPointData_51(boolean id0);
  public void SetPassPointData(boolean id0)
  {
    SetPassPointData_51(id0);
  }

  private native boolean GetPassPointData_52();
  public boolean GetPassPointData()
  {
    return GetPassPointData_52();
  }

  private native void PassPointDataOn_53();
  public void PassPointDataOn()
  {
    PassPointDataOn_53();
  }

  private native void PassPointDataOff_54();
  public void PassPointDataOff()
  {
    PassPointDataOff_54();
  }

  private native void SetPointInterpolation_55(int id0);
  public void SetPointInterpolation(int id0)
  {
    SetPointInterpolation_55(id0);
  }

  private native int GetPointInterpolationMinValue_56();
  public int GetPointInterpolationMinValue()
  {
    return GetPointInterpolationMinValue_56();
  }

  private native int GetPointInterpolationMaxValue_57();
  public int GetPointInterpolationMaxValue()
  {
    return GetPointInterpolationMaxValue_57();
  }

  private native int GetPointInterpolation_58();
  public int GetPointInterpolation()
  {
    return GetPointInterpolation_58();
  }

  private native void SetPointInterpolationToTargetEdges_59();
  public void SetPointInterpolationToTargetEdges()
  {
    SetPointInterpolationToTargetEdges_59();
  }

  private native void SetPointInterpolationToImprintEdges_60();
  public void SetPointInterpolationToImprintEdges()
  {
    SetPointInterpolationToImprintEdges_60();
  }

  private native void SetTriangulateOutput_61(boolean id0);
  public void SetTriangulateOutput(boolean id0)
  {
    SetTriangulateOutput_61(id0);
  }

  private native boolean GetTriangulateOutput_62();
  public boolean GetTriangulateOutput()
  {
    return GetTriangulateOutput_62();
  }

  private native void TriangulateOutputOn_63();
  public void TriangulateOutputOn()
  {
    TriangulateOutputOn_63();
  }

  private native void TriangulateOutputOff_64();
  public void TriangulateOutputOff()
  {
    TriangulateOutputOff_64();
  }

  private native void SetDebugOutputType_65(int id0);
  public void SetDebugOutputType(int id0)
  {
    SetDebugOutputType_65(id0);
  }

  private native int GetDebugOutputTypeMinValue_66();
  public int GetDebugOutputTypeMinValue()
  {
    return GetDebugOutputTypeMinValue_66();
  }

  private native int GetDebugOutputTypeMaxValue_67();
  public int GetDebugOutputTypeMaxValue()
  {
    return GetDebugOutputTypeMaxValue_67();
  }

  private native int GetDebugOutputType_68();
  public int GetDebugOutputType()
  {
    return GetDebugOutputType_68();
  }

  private native void SetDebugOutputTypeToNoDebugOutput_69();
  public void SetDebugOutputTypeToNoDebugOutput()
  {
    SetDebugOutputTypeToNoDebugOutput_69();
  }

  private native void SetDebugOutputTypeToTriangulationInput_70();
  public void SetDebugOutputTypeToTriangulationInput()
  {
    SetDebugOutputTypeToTriangulationInput_70();
  }

  private native void SetDebugOutputTypeToTriangulationOutput_71();
  public void SetDebugOutputTypeToTriangulationOutput()
  {
    SetDebugOutputTypeToTriangulationOutput_71();
  }

  private native void SetDebugCellId_72(long id0);
  public void SetDebugCellId(long id0)
  {
    SetDebugCellId_72(id0);
  }

  private native long GetDebugCellId_73();
  public long GetDebugCellId()
  {
    return GetDebugCellId_73();
  }

  private native long GetDebugOutput_74();
  public vtkPolyData GetDebugOutput()
  {
    long temp = GetDebugOutput_74();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImprintFilter() { super(); }

  public vtkImprintFilter(long id) { super(id); }
  public native long   VTKInit();

}
