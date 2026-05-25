// java wrapper for vtkAMRInformation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRInformation extends vtkObject
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

  private native int GetGridDescription_4();
  public int GetGridDescription()
  {
    return GetGridDescription_4();
  }

  private native void SetGridDescription_5(int id0);
  public void SetGridDescription(int id0)
  {
    SetGridDescription_5(id0);
  }

  private native void GetOrigin_6(double id0[]);
  public void GetOrigin(double id0[])
  {
    GetOrigin_6(id0);
  }

  private native int GetNumberOfLevels_7();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_7();
  }

  private native int GetNumberOfDataSets_8(int id0);
  public int GetNumberOfDataSets(int id0)
  {
    return GetNumberOfDataSets_8(id0);
  }

  private native int GetTotalNumberOfBlocks_9();
  public int GetTotalNumberOfBlocks()
  {
    return GetTotalNumberOfBlocks_9();
  }

  private native int GetIndex_10(int id0,int id1);
  public int GetIndex(int id0,int id1)
  {
    return GetIndex_10(id0,id1);
  }

  private native void GetSpacing_11(int id0,double id1[]);
  public void GetSpacing(int id0,double id1[])
  {
    GetSpacing_11(id0,id1);
  }

  private native boolean HasSpacing_12(int id0);
  public boolean HasSpacing(int id0)
  {
    return HasSpacing_12(id0);
  }

  private native int GetAMRBlockSourceIndex_13(int id0);
  public int GetAMRBlockSourceIndex(int id0)
  {
    return GetAMRBlockSourceIndex_13(id0);
  }

  private native void SetAMRBlockSourceIndex_14(int id0,int id1);
  public void SetAMRBlockSourceIndex(int id0,int id1)
  {
    SetAMRBlockSourceIndex_14(id0,id1);
  }

  private native void GenerateRefinementRatio_15();
  public void GenerateRefinementRatio()
  {
    GenerateRefinementRatio_15();
  }

  private native boolean HasRefinementRatio_16();
  public boolean HasRefinementRatio()
  {
    return HasRefinementRatio_16();
  }

  private native void SetRefinementRatio_17(int id0,int id1);
  public void SetRefinementRatio(int id0,int id1)
  {
    SetRefinementRatio_17(id0,id1);
  }

  private native int GetRefinementRatio_18(int id0);
  public int GetRefinementRatio(int id0)
  {
    return GetRefinementRatio_18(id0);
  }

  private native boolean HasChildrenInformation_19();
  public boolean HasChildrenInformation()
  {
    return HasChildrenInformation_19();
  }

  private native void PrintParentChildInfo_20(int id0,int id1);
  public void PrintParentChildInfo(int id0,int id1)
  {
    PrintParentChildInfo_20(id0,id1);
  }

  private native void GenerateParentChildInformation_21();
  public void GenerateParentChildInformation()
  {
    GenerateParentChildInformation_21();
  }

  private native boolean Audit_22();
  public boolean Audit()
  {
    return Audit_22();
  }

  private native void DeepCopy_23(vtkAMRInformation id0);
  public void DeepCopy(vtkAMRInformation id0)
  {
    DeepCopy_23(id0);
  }

  public vtkAMRInformation() { super(); }

  public vtkAMRInformation(long id) { super(id); }
  public native long   VTKInit();

}
