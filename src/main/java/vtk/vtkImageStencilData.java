// java wrapper for vtkImageStencilData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageStencilData extends vtkDataObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native void DeepCopy_5(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_5(id0);
  }

  private native void ShallowCopy_6(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_6(id0);
  }

  private native void InternalImageStencilDataCopy_7(vtkImageStencilData id0);
  public void InternalImageStencilDataCopy(vtkImageStencilData id0)
  {
    InternalImageStencilDataCopy_7(id0);
  }

  private native int GetDataObjectType_8();
  public int GetDataObjectType()
  {
    return GetDataObjectType_8();
  }

  private native int GetExtentType_9();
  public int GetExtentType()
  {
    return GetExtentType_9();
  }

  private native int IsInside_10(int id0,int id1,int id2);
  public int IsInside(int id0,int id1,int id2)
  {
    return IsInside_10(id0,id1,id2);
  }

  private native void InsertNextExtent_11(int id0,int id1,int id2,int id3);
  public void InsertNextExtent(int id0,int id1,int id2,int id3)
  {
    InsertNextExtent_11(id0,id1,id2,id3);
  }

  private native void InsertAndMergeExtent_12(int id0,int id1,int id2,int id3);
  public void InsertAndMergeExtent(int id0,int id1,int id2,int id3)
  {
    InsertAndMergeExtent_12(id0,id1,id2,id3);
  }

  private native void RemoveExtent_13(int id0,int id1,int id2,int id3);
  public void RemoveExtent(int id0,int id1,int id2,int id3)
  {
    RemoveExtent_13(id0,id1,id2,id3);
  }

  private native void SetSpacing_14(double id0,double id1,double id2);
  public void SetSpacing(double id0,double id1,double id2)
  {
    SetSpacing_14(id0,id1,id2);
  }

  private native void SetSpacing_15(double id0[]);
  public void SetSpacing(double id0[])
  {
    SetSpacing_15(id0);
  }

  private native double[] GetSpacing_16();
  public double[] GetSpacing()
  {
    return GetSpacing_16();
  }

  private native void SetOrigin_17(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_17(id0,id1,id2);
  }

  private native void SetOrigin_18(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_18(id0);
  }

  private native double[] GetOrigin_19();
  public double[] GetOrigin()
  {
    return GetOrigin_19();
  }

  private native void SetExtent_20(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_20(id0);
  }

  private native void SetExtent_21(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_21(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_22();
  public int[] GetExtent()
  {
    return GetExtent_22();
  }

  private native void AllocateExtents_23();
  public void AllocateExtents()
  {
    AllocateExtents_23();
  }

  private native void Fill_24();
  public void Fill()
  {
    Fill_24();
  }

  private native void CopyInformationFromPipeline_25(vtkInformation id0);
  public void CopyInformationFromPipeline(vtkInformation id0)
  {
    CopyInformationFromPipeline_25(id0);
  }

  private native void CopyInformationToPipeline_26(vtkInformation id0);
  public void CopyInformationToPipeline(vtkInformation id0)
  {
    CopyInformationToPipeline_26(id0);
  }

  private native long GetData_27(vtkInformation id0);
  public vtkImageStencilData GetData(vtkInformation id0)
  {
    long temp = GetData_27(id0);

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_28(vtkInformationVector id0,int id1);
  public vtkImageStencilData GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_28(id0,id1);

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Add_29(vtkImageStencilData id0);
  public void Add(vtkImageStencilData id0)
  {
    Add_29(id0);
  }

  private native void Subtract_30(vtkImageStencilData id0);
  public void Subtract(vtkImageStencilData id0)
  {
    Subtract_30(id0);
  }

  private native void Replace_31(vtkImageStencilData id0);
  public void Replace(vtkImageStencilData id0)
  {
    Replace_31(id0);
  }

  private native int Clip_32(int id0[]);
  public int Clip(int id0[])
  {
    return Clip_32(id0);
  }

  public vtkImageStencilData() { super(); }

  public vtkImageStencilData(long id) { super(id); }
  public native long   VTKInit();

}
