// java wrapper for vtkSphereTreeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphereTreeFilter extends vtkPolyDataAlgorithm
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

  private native void SetSphereTree_4(vtkSphereTree id0);
  public void SetSphereTree(vtkSphereTree id0)
  {
    SetSphereTree_4(id0);
  }

  private native long GetSphereTree_5();
  public vtkSphereTree GetSphereTree()
  {
    long temp = GetSphereTree_5();

    if (temp == 0) return null;
    return (vtkSphereTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExtractionMode_6(int id0);
  public void SetExtractionMode(int id0)
  {
    SetExtractionMode_6(id0);
  }

  private native int GetExtractionMode_7();
  public int GetExtractionMode()
  {
    return GetExtractionMode_7();
  }

  private native void SetExtractionModeToLevels_8();
  public void SetExtractionModeToLevels()
  {
    SetExtractionModeToLevels_8();
  }

  private native void SetExtractionModeToPoint_9();
  public void SetExtractionModeToPoint()
  {
    SetExtractionModeToPoint_9();
  }

  private native void SetExtractionModeToLine_10();
  public void SetExtractionModeToLine()
  {
    SetExtractionModeToLine_10();
  }

  private native void SetExtractionModeToPlane_11();
  public void SetExtractionModeToPlane()
  {
    SetExtractionModeToPlane_11();
  }

  private native byte[] GetExtractionModeAsString_12();
  public String GetExtractionModeAsString()
  {
    return new String(GetExtractionModeAsString_12(), StandardCharsets.UTF_8);
  }

  private native void SetTreeHierarchy_13(boolean id0);
  public void SetTreeHierarchy(boolean id0)
  {
    SetTreeHierarchy_13(id0);
  }

  private native boolean GetTreeHierarchy_14();
  public boolean GetTreeHierarchy()
  {
    return GetTreeHierarchy_14();
  }

  private native void TreeHierarchyOn_15();
  public void TreeHierarchyOn()
  {
    TreeHierarchyOn_15();
  }

  private native void TreeHierarchyOff_16();
  public void TreeHierarchyOff()
  {
    TreeHierarchyOff_16();
  }

  private native void SetLevel_17(int id0);
  public void SetLevel(int id0)
  {
    SetLevel_17(id0);
  }

  private native int GetLevelMinValue_18();
  public int GetLevelMinValue()
  {
    return GetLevelMinValue_18();
  }

  private native int GetLevelMaxValue_19();
  public int GetLevelMaxValue()
  {
    return GetLevelMaxValue_19();
  }

  private native int GetLevel_20();
  public int GetLevel()
  {
    return GetLevel_20();
  }

  private native void SetPoint_21(double id0,double id1,double id2);
  public void SetPoint(double id0,double id1,double id2)
  {
    SetPoint_21(id0,id1,id2);
  }

  private native void SetPoint_22(double id0[]);
  public void SetPoint(double id0[])
  {
    SetPoint_22(id0);
  }

  private native double[] GetPoint_23();
  public double[] GetPoint()
  {
    return GetPoint_23();
  }

  private native void SetRay_24(double id0,double id1,double id2);
  public void SetRay(double id0,double id1,double id2)
  {
    SetRay_24(id0,id1,id2);
  }

  private native void SetRay_25(double id0[]);
  public void SetRay(double id0[])
  {
    SetRay_25(id0);
  }

  private native double[] GetRay_26();
  public double[] GetRay()
  {
    return GetRay_26();
  }

  private native void SetNormal_27(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_27(id0,id1,id2);
  }

  private native void SetNormal_28(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_28(id0);
  }

  private native double[] GetNormal_29();
  public double[] GetNormal()
  {
    return GetNormal_29();
  }

  private native long GetMTime_30();
  public long GetMTime()
  {
    return GetMTime_30();
  }

  public vtkSphereTreeFilter() { super(); }

  public vtkSphereTreeFilter(long id) { super(id); }
  public native long   VTKInit();

}
