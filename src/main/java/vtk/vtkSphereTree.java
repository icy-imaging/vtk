// java wrapper for vtkSphereTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphereTree extends vtkObject
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

  private native void SetDataSet_4(vtkDataSet id0);
  public void SetDataSet(vtkDataSet id0)
  {
    SetDataSet_4(id0);
  }

  private native long GetDataSet_5();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Build_6();
  public void Build()
  {
    Build_6();
  }

  private native void Build_7(vtkDataSet id0);
  public void Build(vtkDataSet id0)
  {
    Build_7(id0);
  }

  private native void SetBuildHierarchy_8(boolean id0);
  public void SetBuildHierarchy(boolean id0)
  {
    SetBuildHierarchy_8(id0);
  }

  private native boolean GetBuildHierarchy_9();
  public boolean GetBuildHierarchy()
  {
    return GetBuildHierarchy_9();
  }

  private native void BuildHierarchyOn_10();
  public void BuildHierarchyOn()
  {
    BuildHierarchyOn_10();
  }

  private native void BuildHierarchyOff_11();
  public void BuildHierarchyOff()
  {
    BuildHierarchyOff_11();
  }

  private native void SelectPoint_12(double id0[],vtkIdList id1);
  public void SelectPoint(double id0[],vtkIdList id1)
  {
    SelectPoint_12(id0,id1);
  }

  private native void SelectLine_13(double id0[],double id1[],vtkIdList id2);
  public void SelectLine(double id0[],double id1[],vtkIdList id2)
  {
    SelectLine_13(id0,id1,id2);
  }

  private native void SelectPlane_14(double id0[],double id1[],vtkIdList id2);
  public void SelectPlane(double id0[],double id1[],vtkIdList id2)
  {
    SelectPlane_14(id0,id1,id2);
  }

  private native void SetResolution_15(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_15(id0);
  }

  private native int GetResolutionMinValue_16();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_16();
  }

  private native int GetResolutionMaxValue_17();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_17();
  }

  private native int GetResolution_18();
  public int GetResolution()
  {
    return GetResolution_18();
  }

  private native void SetMaxLevel_19(int id0);
  public void SetMaxLevel(int id0)
  {
    SetMaxLevel_19(id0);
  }

  private native int GetMaxLevelMinValue_20();
  public int GetMaxLevelMinValue()
  {
    return GetMaxLevelMinValue_20();
  }

  private native int GetMaxLevelMaxValue_21();
  public int GetMaxLevelMaxValue()
  {
    return GetMaxLevelMaxValue_21();
  }

  private native int GetMaxLevel_22();
  public int GetMaxLevel()
  {
    return GetMaxLevel_22();
  }

  private native int GetNumberOfLevels_23();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_23();
  }

  private native boolean UsesGarbageCollector_24();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_24();
  }

  public vtkSphereTree() { super(); }

  public vtkSphereTree(long id) { super(id); }
  public native long   VTKInit();

}
