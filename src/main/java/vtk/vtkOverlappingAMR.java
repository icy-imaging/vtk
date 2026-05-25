// java wrapper for vtkOverlappingAMR object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOverlappingAMR extends vtkUniformGridAMR
{

  private native int GetDataObjectType_0();
  public int GetDataObjectType()
  {
    return GetDataObjectType_0();
  }

  private native int IsTypeOf_1(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_1(bytes0, bytes0.length);
  }

  private native int IsA_2(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_4(bytes0, bytes0.length);
  }

  private native long NewIterator_5();
  public vtkCompositeDataIterator NewIterator()
  {
    long temp = NewIterator_5();

    if (temp == 0) return null;
    return (vtkCompositeDataIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOrigin_6(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_6(id0);
  }

  private native void SetSpacing_7(int id0,double id1[]);
  public void SetSpacing(int id0,double id1[])
  {
    SetSpacing_7(id0,id1);
  }

  private native void GetSpacing_8(int id0,double id1[]);
  public void GetSpacing(int id0,double id1[])
  {
    GetSpacing_8(id0,id1);
  }

  private native void GetBounds_9(int id0,int id1,double id2[]);
  public void GetBounds(int id0,int id1,double id2[])
  {
    GetBounds_9(id0,id1,id2);
  }

  private native void GetOrigin_10(int id0,int id1,double id2[]);
  public void GetOrigin(int id0,int id1,double id2[])
  {
    GetOrigin_10(id0,id1,id2);
  }

  private native long NUMBER_OF_BLANKED_POINTS_11();
  public vtkInformationIdTypeKey NUMBER_OF_BLANKED_POINTS()
  {
    long temp = NUMBER_OF_BLANKED_POINTS_11();

    if (temp == 0) return null;
    return (vtkInformationIdTypeKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_12(vtkInformation id0);
  public vtkOverlappingAMR GetData(vtkInformation id0)
  {
    long temp = GetData_12(id0);

    if (temp == 0) return null;
    return (vtkOverlappingAMR)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_13(vtkInformationVector id0,int id1);
  public vtkOverlappingAMR GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_13(id0,id1);

    if (temp == 0) return null;
    return (vtkOverlappingAMR)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRefinementRatio_14(int id0,int id1);
  public void SetRefinementRatio(int id0,int id1)
  {
    SetRefinementRatio_14(id0,id1);
  }

  private native int GetRefinementRatio_15(int id0);
  public int GetRefinementRatio(int id0)
  {
    return GetRefinementRatio_15(id0);
  }

  private native void SetAMRBlockSourceIndex_16(int id0,int id1,int id2);
  public void SetAMRBlockSourceIndex(int id0,int id1,int id2)
  {
    SetAMRBlockSourceIndex_16(id0,id1,id2);
  }

  private native int GetAMRBlockSourceIndex_17(int id0,int id1);
  public int GetAMRBlockSourceIndex(int id0,int id1)
  {
    return GetAMRBlockSourceIndex_17(id0,id1);
  }

  private native int GetRefinementRatio_18(vtkCompositeDataIterator id0);
  public int GetRefinementRatio(vtkCompositeDataIterator id0)
  {
    return GetRefinementRatio_18(id0);
  }

  private native boolean HasChildrenInformation_19();
  public boolean HasChildrenInformation()
  {
    return HasChildrenInformation_19();
  }

  private native void GenerateParentChildInformation_20();
  public void GenerateParentChildInformation()
  {
    GenerateParentChildInformation_20();
  }

  private native void PrintParentChildInfo_21(int id0,int id1);
  public void PrintParentChildInfo(int id0,int id1)
  {
    PrintParentChildInfo_21(id0,id1);
  }

  private native void GetBounds_22(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_22(id0);
  }

  private native long GetAMRInfo_23();
  public vtkAMRInformation GetAMRInfo()
  {
    long temp = GetAMRInfo_23();

    if (temp == 0) return null;
    return (vtkAMRInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAMRInfo_24(vtkAMRInformation id0);
  public void SetAMRInfo(vtkAMRInformation id0)
  {
    SetAMRInfo_24(id0);
  }

  private native void Audit_25();
  public void Audit()
  {
    Audit_25();
  }

  public vtkOverlappingAMR() { super(); }

  public vtkOverlappingAMR(long id) { super(id); }
  public native long   VTKInit();

}
