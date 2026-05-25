// java wrapper for vtkPlaneCutter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlaneCutter extends vtkDataObjectAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetPlane_5(vtkPlane id0);
  public void SetPlane(vtkPlane id0)
  {
    SetPlane_5(id0);
  }

  private native long GetPlane_6();
  public vtkPlane GetPlane()
  {
    long temp = GetPlane_6();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputeNormals_7(boolean id0);
  public void SetComputeNormals(boolean id0)
  {
    SetComputeNormals_7(id0);
  }

  private native boolean GetComputeNormals_8();
  public boolean GetComputeNormals()
  {
    return GetComputeNormals_8();
  }

  private native void ComputeNormalsOn_9();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_9();
  }

  private native void ComputeNormalsOff_10();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_10();
  }

  private native void SetInterpolateAttributes_11(boolean id0);
  public void SetInterpolateAttributes(boolean id0)
  {
    SetInterpolateAttributes_11(id0);
  }

  private native boolean GetInterpolateAttributes_12();
  public boolean GetInterpolateAttributes()
  {
    return GetInterpolateAttributes_12();
  }

  private native void InterpolateAttributesOn_13();
  public void InterpolateAttributesOn()
  {
    InterpolateAttributesOn_13();
  }

  private native void InterpolateAttributesOff_14();
  public void InterpolateAttributesOff()
  {
    InterpolateAttributesOff_14();
  }

  private native void SetGeneratePolygons_15(boolean id0);
  public void SetGeneratePolygons(boolean id0)
  {
    SetGeneratePolygons_15(id0);
  }

  private native boolean GetGeneratePolygons_16();
  public boolean GetGeneratePolygons()
  {
    return GetGeneratePolygons_16();
  }

  private native void GeneratePolygonsOn_17();
  public void GeneratePolygonsOn()
  {
    GeneratePolygonsOn_17();
  }

  private native void GeneratePolygonsOff_18();
  public void GeneratePolygonsOff()
  {
    GeneratePolygonsOff_18();
  }

  private native void SetBuildTree_19(boolean id0);
  public void SetBuildTree(boolean id0)
  {
    SetBuildTree_19(id0);
  }

  private native boolean GetBuildTree_20();
  public boolean GetBuildTree()
  {
    return GetBuildTree_20();
  }

  private native void BuildTreeOn_21();
  public void BuildTreeOn()
  {
    BuildTreeOn_21();
  }

  private native void BuildTreeOff_22();
  public void BuildTreeOff()
  {
    BuildTreeOff_22();
  }

  private native void SetBuildHierarchy_23(boolean id0);
  public void SetBuildHierarchy(boolean id0)
  {
    SetBuildHierarchy_23(id0);
  }

  private native boolean GetBuildHierarchy_24();
  public boolean GetBuildHierarchy()
  {
    return GetBuildHierarchy_24();
  }

  private native void BuildHierarchyOn_25();
  public void BuildHierarchyOn()
  {
    BuildHierarchyOn_25();
  }

  private native void BuildHierarchyOff_26();
  public void BuildHierarchyOff()
  {
    BuildHierarchyOff_26();
  }

  private native void SetMergePoints_27(boolean id0);
  public void SetMergePoints(boolean id0)
  {
    SetMergePoints_27(id0);
  }

  private native boolean GetMergePoints_28();
  public boolean GetMergePoints()
  {
    return GetMergePoints_28();
  }

  private native void MergePointsOn_29();
  public void MergePointsOn()
  {
    MergePointsOn_29();
  }

  private native void MergePointsOff_30();
  public void MergePointsOff()
  {
    MergePointsOff_30();
  }

  private native void SetOutputPointsPrecision_31(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_31(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_32();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_32();
  }

  private native int GetOutputPointsPrecisionMaxValue_33();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_33();
  }

  private native int GetOutputPointsPrecision_34();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_34();
  }

  public vtkPlaneCutter() { super(); }

  public vtkPlaneCutter(long id) { super(id); }
  public native long   VTKInit();

}
