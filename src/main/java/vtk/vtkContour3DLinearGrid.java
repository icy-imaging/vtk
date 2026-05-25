// java wrapper for vtkContour3DLinearGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContour3DLinearGrid extends vtkDataObjectAlgorithm
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

  private native void SetValue_4(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_4(id0,id1);
  }

  private native double GetValue_5(int id0);
  public double GetValue(int id0)
  {
    return GetValue_5(id0);
  }

  private native void SetNumberOfContours_6(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_6(id0);
  }

  private native long GetNumberOfContours_7();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_7();
  }

  private native void GenerateValues_8(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_8(id0,id1);
  }

  private native void GenerateValues_9(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_9(id0,id1,id2);
  }

  private native void SetMergePoints_10(int id0);
  public void SetMergePoints(int id0)
  {
    SetMergePoints_10(id0);
  }

  private native int GetMergePoints_11();
  public int GetMergePoints()
  {
    return GetMergePoints_11();
  }

  private native void MergePointsOn_12();
  public void MergePointsOn()
  {
    MergePointsOn_12();
  }

  private native void MergePointsOff_13();
  public void MergePointsOff()
  {
    MergePointsOff_13();
  }

  private native void SetInterpolateAttributes_14(int id0);
  public void SetInterpolateAttributes(int id0)
  {
    SetInterpolateAttributes_14(id0);
  }

  private native int GetInterpolateAttributes_15();
  public int GetInterpolateAttributes()
  {
    return GetInterpolateAttributes_15();
  }

  private native void InterpolateAttributesOn_16();
  public void InterpolateAttributesOn()
  {
    InterpolateAttributesOn_16();
  }

  private native void InterpolateAttributesOff_17();
  public void InterpolateAttributesOff()
  {
    InterpolateAttributesOff_17();
  }

  private native void SetComputeNormals_18(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_18(id0);
  }

  private native int GetComputeNormals_19();
  public int GetComputeNormals()
  {
    return GetComputeNormals_19();
  }

  private native void ComputeNormalsOn_20();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_20();
  }

  private native void ComputeNormalsOff_21();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_21();
  }

  private native void SetComputeScalars_22(int id0);
  public void SetComputeScalars(int id0)
  {
    SetComputeScalars_22(id0);
  }

  private native int GetComputeScalars_23();
  public int GetComputeScalars()
  {
    return GetComputeScalars_23();
  }

  private native void ComputeScalarsOn_24();
  public void ComputeScalarsOn()
  {
    ComputeScalarsOn_24();
  }

  private native void ComputeScalarsOff_25();
  public void ComputeScalarsOff()
  {
    ComputeScalarsOff_25();
  }

  private native void SetOutputPointsPrecision_26(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_26(id0);
  }

  private native int GetOutputPointsPrecision_27();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_27();
  }

  private native long GetMTime_28();
  public long GetMTime()
  {
    return GetMTime_28();
  }

  private native void SetUseScalarTree_29(int id0);
  public void SetUseScalarTree(int id0)
  {
    SetUseScalarTree_29(id0);
  }

  private native int GetUseScalarTree_30();
  public int GetUseScalarTree()
  {
    return GetUseScalarTree_30();
  }

  private native void UseScalarTreeOn_31();
  public void UseScalarTreeOn()
  {
    UseScalarTreeOn_31();
  }

  private native void UseScalarTreeOff_32();
  public void UseScalarTreeOff()
  {
    UseScalarTreeOff_32();
  }

  private native void SetScalarTree_33(vtkScalarTree id0);
  public void SetScalarTree(vtkScalarTree id0)
  {
    SetScalarTree_33(id0);
  }

  private native long GetScalarTree_34();
  public vtkScalarTree GetScalarTree()
  {
    long temp = GetScalarTree_34();

    if (temp == 0) return null;
    return (vtkScalarTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSequentialProcessing_35(int id0);
  public void SetSequentialProcessing(int id0)
  {
    SetSequentialProcessing_35(id0);
  }

  private native int GetSequentialProcessing_36();
  public int GetSequentialProcessing()
  {
    return GetSequentialProcessing_36();
  }

  private native void SequentialProcessingOn_37();
  public void SequentialProcessingOn()
  {
    SequentialProcessingOn_37();
  }

  private native void SequentialProcessingOff_38();
  public void SequentialProcessingOff()
  {
    SequentialProcessingOff_38();
  }

  private native int GetNumberOfThreadsUsed_39();
  public int GetNumberOfThreadsUsed()
  {
    return GetNumberOfThreadsUsed_39();
  }

  private native boolean GetLargeIds_40();
  public boolean GetLargeIds()
  {
    return GetLargeIds_40();
  }

  private native boolean CanFullyProcessDataObject_41(vtkDataObject id0,byte[] id1, int len1);
  public boolean CanFullyProcessDataObject(vtkDataObject id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return CanFullyProcessDataObject_41(id0,bytes1, bytes1.length);
  }

  public vtkContour3DLinearGrid() { super(); }

  public vtkContour3DLinearGrid(long id) { super(id); }
  public native long   VTKInit();

}
