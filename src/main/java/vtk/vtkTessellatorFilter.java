// java wrapper for vtkTessellatorFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTessellatorFilter extends vtkUnstructuredGridAlgorithm
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

  private native void SetTessellator_4(vtkStreamingTessellator id0);
  public void SetTessellator(vtkStreamingTessellator id0)
  {
    SetTessellator_4(id0);
  }

  private native long GetTessellator_5();
  public vtkStreamingTessellator GetTessellator()
  {
    long temp = GetTessellator_5();

    if (temp == 0) return null;
    return (vtkStreamingTessellator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSubdivider_6(vtkDataSetEdgeSubdivisionCriterion id0);
  public void SetSubdivider(vtkDataSetEdgeSubdivisionCriterion id0)
  {
    SetSubdivider_6(id0);
  }

  private native long GetSubdivider_7();
  public vtkDataSetEdgeSubdivisionCriterion GetSubdivider()
  {
    long temp = GetSubdivider_7();

    if (temp == 0) return null;
    return (vtkDataSetEdgeSubdivisionCriterion)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_8();
  public long GetMTime()
  {
    return GetMTime_8();
  }

  private native void SetOutputDimension_9(int id0);
  public void SetOutputDimension(int id0)
  {
    SetOutputDimension_9(id0);
  }

  private native int GetOutputDimensionMinValue_10();
  public int GetOutputDimensionMinValue()
  {
    return GetOutputDimensionMinValue_10();
  }

  private native int GetOutputDimensionMaxValue_11();
  public int GetOutputDimensionMaxValue()
  {
    return GetOutputDimensionMaxValue_11();
  }

  private native int GetOutputDimension_12();
  public int GetOutputDimension()
  {
    return GetOutputDimension_12();
  }

  private native void SetMaximumNumberOfSubdivisions_13(int id0);
  public void SetMaximumNumberOfSubdivisions(int id0)
  {
    SetMaximumNumberOfSubdivisions_13(id0);
  }

  private native int GetMaximumNumberOfSubdivisions_14();
  public int GetMaximumNumberOfSubdivisions()
  {
    return GetMaximumNumberOfSubdivisions_14();
  }

  private native void SetChordError_15(double id0);
  public void SetChordError(double id0)
  {
    SetChordError_15(id0);
  }

  private native double GetChordError_16();
  public double GetChordError()
  {
    return GetChordError_16();
  }

  private native void ResetFieldCriteria_17();
  public void ResetFieldCriteria()
  {
    ResetFieldCriteria_17();
  }

  private native void SetFieldCriterion_18(int id0,double id1);
  public void SetFieldCriterion(int id0,double id1)
  {
    SetFieldCriterion_18(id0,id1);
  }

  private native int GetMergePoints_19();
  public int GetMergePoints()
  {
    return GetMergePoints_19();
  }

  private native void SetMergePoints_20(int id0);
  public void SetMergePoints(int id0)
  {
    SetMergePoints_20(id0);
  }

  private native void MergePointsOn_21();
  public void MergePointsOn()
  {
    MergePointsOn_21();
  }

  private native void MergePointsOff_22();
  public void MergePointsOff()
  {
    MergePointsOff_22();
  }

  public vtkTessellatorFilter() { super(); }

  public vtkTessellatorFilter(long id) { super(id); }
  public native long   VTKInit();

}
