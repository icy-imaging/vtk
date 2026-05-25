// java wrapper for vtkSimpleScalarTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSimpleScalarTree extends vtkScalarTree
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

  private native void ShallowCopy_4(vtkScalarTree id0);
  public void ShallowCopy(vtkScalarTree id0)
  {
    ShallowCopy_4(id0);
  }

  private native void SetBranchingFactor_5(int id0);
  public void SetBranchingFactor(int id0)
  {
    SetBranchingFactor_5(id0);
  }

  private native int GetBranchingFactorMinValue_6();
  public int GetBranchingFactorMinValue()
  {
    return GetBranchingFactorMinValue_6();
  }

  private native int GetBranchingFactorMaxValue_7();
  public int GetBranchingFactorMaxValue()
  {
    return GetBranchingFactorMaxValue_7();
  }

  private native int GetBranchingFactor_8();
  public int GetBranchingFactor()
  {
    return GetBranchingFactor_8();
  }

  private native int GetLevel_9();
  public int GetLevel()
  {
    return GetLevel_9();
  }

  private native void SetMaxLevel_10(int id0);
  public void SetMaxLevel(int id0)
  {
    SetMaxLevel_10(id0);
  }

  private native int GetMaxLevelMinValue_11();
  public int GetMaxLevelMinValue()
  {
    return GetMaxLevelMinValue_11();
  }

  private native int GetMaxLevelMaxValue_12();
  public int GetMaxLevelMaxValue()
  {
    return GetMaxLevelMaxValue_12();
  }

  private native int GetMaxLevel_13();
  public int GetMaxLevel()
  {
    return GetMaxLevel_13();
  }

  private native void BuildTree_14();
  public void BuildTree()
  {
    BuildTree_14();
  }

  private native void Initialize_15();
  public void Initialize()
  {
    Initialize_15();
  }

  private native void InitTraversal_16(double id0);
  public void InitTraversal(double id0)
  {
    InitTraversal_16(id0);
  }

  private native long GetNumberOfCellBatches_17(double id0);
  public long GetNumberOfCellBatches(double id0)
  {
    return GetNumberOfCellBatches_17(id0);
  }

  public vtkSimpleScalarTree() { super(); }

  public vtkSimpleScalarTree(long id) { super(id); }
  public native long   VTKInit();

}
