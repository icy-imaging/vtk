// java wrapper for vtkUniformGridAMR object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUniformGridAMR extends vtkCompositeDataSet
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

  private native long NewIterator_4();
  public vtkCompositeDataIterator NewIterator()
  {
    long temp = NewIterator_4();

    if (temp == 0) return null;
    return (vtkCompositeDataIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native void SetGridDescription_7(int id0);
  public void SetGridDescription(int id0)
  {
    SetGridDescription_7(id0);
  }

  private native int GetGridDescription_8();
  public int GetGridDescription()
  {
    return GetGridDescription_8();
  }

  private native int GetNumberOfLevels_9();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_9();
  }

  private native int GetTotalNumberOfBlocks_10();
  public int GetTotalNumberOfBlocks()
  {
    return GetTotalNumberOfBlocks_10();
  }

  private native int GetNumberOfDataSets_11(int id0);
  public int GetNumberOfDataSets(int id0)
  {
    return GetNumberOfDataSets_11(id0);
  }

  private native void GetBounds_12(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_12(id0);
  }

  private native void GetMin_13(double id0[]);
  public void GetMin(double id0[])
  {
    GetMin_13(id0);
  }

  private native void GetMax_14(double id0[]);
  public void GetMax(double id0[])
  {
    GetMax_14(id0);
  }

  private native void SetDataSet_15(vtkCompositeDataIterator id0,vtkDataObject id1);
  public void SetDataSet(vtkCompositeDataIterator id0,vtkDataObject id1)
  {
    SetDataSet_15(id0,id1);
  }

  private native void SetDataSet_16(int id0,int id1,vtkUniformGrid id2);
  public void SetDataSet(int id0,int id1,vtkUniformGrid id2)
  {
    SetDataSet_16(id0,id1,id2);
  }

  private native long GetDataSet_17(vtkCompositeDataIterator id0);
  public vtkDataObject GetDataSet(vtkCompositeDataIterator id0)
  {
    long temp = GetDataSet_17(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_18(int id0,int id1);
  public vtkUniformGrid GetDataSet(int id0,int id1)
  {
    long temp = GetDataSet_18(id0,id1);

    if (temp == 0) return null;
    return (vtkUniformGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetCompositeIndex_19(int id0,int id1);
  public int GetCompositeIndex(int id0,int id1)
  {
    return GetCompositeIndex_19(id0,id1);
  }

  private native void CompositeShallowCopy_20(vtkCompositeDataSet id0);
  public void CompositeShallowCopy(vtkCompositeDataSet id0)
  {
    CompositeShallowCopy_20(id0);
  }

  private native void ShallowCopy_21(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_21(id0);
  }

  private native void RecursiveShallowCopy_22(vtkDataObject id0);
  public void RecursiveShallowCopy(vtkDataObject id0)
  {
    RecursiveShallowCopy_22(id0);
  }

  private native void DeepCopy_23(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_23(id0);
  }

  private native void CopyStructure_24(vtkCompositeDataSet id0);
  public void CopyStructure(vtkCompositeDataSet id0)
  {
    CopyStructure_24(id0);
  }

  private native long GetData_25(vtkInformation id0);
  public vtkUniformGridAMR GetData(vtkInformation id0)
  {
    long temp = GetData_25(id0);

    if (temp == 0) return null;
    return (vtkUniformGridAMR)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_26(vtkInformationVector id0,int id1);
  public vtkUniformGridAMR GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_26(id0,id1);

    if (temp == 0) return null;
    return (vtkUniformGridAMR)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_27(int id0);
  public vtkDataObject GetDataSet(int id0)
  {
    long temp = GetDataSet_27(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkUniformGridAMR() { super(); }

  public vtkUniformGridAMR(long id) { super(id); }
  public native long   VTKInit();

}
