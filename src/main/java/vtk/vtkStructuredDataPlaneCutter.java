// java wrapper for vtkStructuredDataPlaneCutter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredDataPlaneCutter extends vtkPolyDataAlgorithm
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

  private native void SetGeneratePolygons_7(boolean id0);
  public void SetGeneratePolygons(boolean id0)
  {
    SetGeneratePolygons_7(id0);
  }

  private native boolean GetGeneratePolygons_8();
  public boolean GetGeneratePolygons()
  {
    return GetGeneratePolygons_8();
  }

  private native void GeneratePolygonsOn_9();
  public void GeneratePolygonsOn()
  {
    GeneratePolygonsOn_9();
  }

  private native void GeneratePolygonsOff_10();
  public void GeneratePolygonsOff()
  {
    GeneratePolygonsOff_10();
  }

  private native void SetBuildTree_11(boolean id0);
  public void SetBuildTree(boolean id0)
  {
    SetBuildTree_11(id0);
  }

  private native boolean GetBuildTree_12();
  public boolean GetBuildTree()
  {
    return GetBuildTree_12();
  }

  private native void BuildTreeOn_13();
  public void BuildTreeOn()
  {
    BuildTreeOn_13();
  }

  private native void BuildTreeOff_14();
  public void BuildTreeOff()
  {
    BuildTreeOff_14();
  }

  private native void SetBuildHierarchy_15(boolean id0);
  public void SetBuildHierarchy(boolean id0)
  {
    SetBuildHierarchy_15(id0);
  }

  private native boolean GetBuildHierarchy_16();
  public boolean GetBuildHierarchy()
  {
    return GetBuildHierarchy_16();
  }

  private native void BuildHierarchyOn_17();
  public void BuildHierarchyOn()
  {
    BuildHierarchyOn_17();
  }

  private native void BuildHierarchyOff_18();
  public void BuildHierarchyOff()
  {
    BuildHierarchyOff_18();
  }

  private native void SetSphereTree_19(vtkSphereTree id0);
  public void SetSphereTree(vtkSphereTree id0)
  {
    SetSphereTree_19(id0);
  }

  private native long GetSphereTree_20();
  public vtkSphereTree GetSphereTree()
  {
    long temp = GetSphereTree_20();

    if (temp == 0) return null;
    return (vtkSphereTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputeNormals_21(boolean id0);
  public void SetComputeNormals(boolean id0)
  {
    SetComputeNormals_21(id0);
  }

  private native boolean GetComputeNormals_22();
  public boolean GetComputeNormals()
  {
    return GetComputeNormals_22();
  }

  private native void ComputeNormalsOn_23();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_23();
  }

  private native void ComputeNormalsOff_24();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_24();
  }

  private native void SetOutputPointsPrecision_25(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_25(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_26();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_26();
  }

  private native int GetOutputPointsPrecisionMaxValue_27();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_27();
  }

  private native int GetOutputPointsPrecision_28();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_28();
  }

  private native void SetInterpolateAttributes_29(boolean id0);
  public void SetInterpolateAttributes(boolean id0)
  {
    SetInterpolateAttributes_29(id0);
  }

  private native boolean GetInterpolateAttributes_30();
  public boolean GetInterpolateAttributes()
  {
    return GetInterpolateAttributes_30();
  }

  private native void InterpolateAttributesOn_31();
  public void InterpolateAttributesOn()
  {
    InterpolateAttributesOn_31();
  }

  private native void InterpolateAttributesOff_32();
  public void InterpolateAttributesOff()
  {
    InterpolateAttributesOff_32();
  }

  private native void SetBatchSize_33(int id0);
  public void SetBatchSize(int id0)
  {
    SetBatchSize_33(id0);
  }

  private native int GetBatchSizeMinValue_34();
  public int GetBatchSizeMinValue()
  {
    return GetBatchSizeMinValue_34();
  }

  private native int GetBatchSizeMaxValue_35();
  public int GetBatchSizeMaxValue()
  {
    return GetBatchSizeMaxValue_35();
  }

  private native int GetBatchSize_36();
  public int GetBatchSize()
  {
    return GetBatchSize_36();
  }

  public vtkStructuredDataPlaneCutter() { super(); }

  public vtkStructuredDataPlaneCutter(long id) { super(id); }
  public native long   VTKInit();

}
