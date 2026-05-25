// java wrapper for vtkHyperTreeGridPreConfiguredSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridPreConfiguredSource extends vtkHyperTreeGridAlgorithm
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

  private native int GetHTGMode_4();
  public int GetHTGMode()
  {
    return GetHTGMode_4();
  }

  private native void SetHTGMode_5(int id0);
  public void SetHTGMode(int id0)
  {
    SetHTGMode_5(id0);
  }

  private native int GetCustomArchitecture_6();
  public int GetCustomArchitecture()
  {
    return GetCustomArchitecture_6();
  }

  private native void SetCustomArchitecture_7(int id0);
  public void SetCustomArchitecture(int id0)
  {
    SetCustomArchitecture_7(id0);
  }

  private native int GetCustomDim_8();
  public int GetCustomDim()
  {
    return GetCustomDim_8();
  }

  private native void SetCustomDim_9(int id0);
  public void SetCustomDim(int id0)
  {
    SetCustomDim_9(id0);
  }

  private native int GetCustomFactor_10();
  public int GetCustomFactor()
  {
    return GetCustomFactor_10();
  }

  private native void SetCustomFactor_11(int id0);
  public void SetCustomFactor(int id0)
  {
    SetCustomFactor_11(id0);
  }

  private native int GetCustomDepth_12();
  public int GetCustomDepth()
  {
    return GetCustomDepth_12();
  }

  private native void SetCustomDepth_13(int id0);
  public void SetCustomDepth(int id0)
  {
    SetCustomDepth_13(id0);
  }

  private native double[] GetCustomExtent_14();
  public double[] GetCustomExtent()
  {
    return GetCustomExtent_14();
  }

  private native void SetCustomExtent_15(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetCustomExtent(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetCustomExtent_15(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCustomExtent_16(double id0[]);
  public void SetCustomExtent(double id0[])
  {
    SetCustomExtent_16(id0);
  }

  private native void SetCustomSubdivisions_17(int id0,int id1,int id2);
  public void SetCustomSubdivisions(int id0,int id1,int id2)
  {
    SetCustomSubdivisions_17(id0,id1,id2);
  }

  private native void GenerateUnbalanced3DepthQuadTree2x3_18(vtkHyperTreeGrid id0);
  public void GenerateUnbalanced3DepthQuadTree2x3(vtkHyperTreeGrid id0)
  {
    GenerateUnbalanced3DepthQuadTree2x3_18(id0);
  }

  private native void GenerateBalanced3DepthQuadTree2x3_19(vtkHyperTreeGrid id0);
  public void GenerateBalanced3DepthQuadTree2x3(vtkHyperTreeGrid id0)
  {
    GenerateBalanced3DepthQuadTree2x3_19(id0);
  }

  private native void GenerateUnbalanced2Depth3BranchTree3x3_20(vtkHyperTreeGrid id0);
  public void GenerateUnbalanced2Depth3BranchTree3x3(vtkHyperTreeGrid id0)
  {
    GenerateUnbalanced2Depth3BranchTree3x3_20(id0);
  }

  private native void GenerateBalanced4Depth3BranchTree2x2_21(vtkHyperTreeGrid id0);
  public void GenerateBalanced4Depth3BranchTree2x2(vtkHyperTreeGrid id0)
  {
    GenerateBalanced4Depth3BranchTree2x2_21(id0);
  }

  private native void GenerateUnbalanced3DepthOctTree3x2x3_22(vtkHyperTreeGrid id0);
  public void GenerateUnbalanced3DepthOctTree3x2x3(vtkHyperTreeGrid id0)
  {
    GenerateUnbalanced3DepthOctTree3x2x3_22(id0);
  }

  private native void GenerateBalanced2Depth3BranchTree3x3x2_23(vtkHyperTreeGrid id0);
  public void GenerateBalanced2Depth3BranchTree3x3x2(vtkHyperTreeGrid id0)
  {
    GenerateBalanced2Depth3BranchTree3x3x2_23(id0);
  }

  private native int GenerateCustom_24(vtkHyperTreeGrid id0);
  public int GenerateCustom(vtkHyperTreeGrid id0)
  {
    return GenerateCustom_24(id0);
  }

  public vtkHyperTreeGridPreConfiguredSource() { super(); }

  public vtkHyperTreeGridPreConfiguredSource(long id) { super(id); }
  public native long   VTKInit();

}
