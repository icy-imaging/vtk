// java wrapper for vtkPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPoints extends vtkObject
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

  private native int Allocate_4(long id0,long id1);
  public int Allocate(long id0,long id1)
  {
    return Allocate_4(id0,id1);
  }

  private native void Initialize_5();
  public void Initialize()
  {
    Initialize_5();
  }

  private native void SetData_6(vtkDataArray id0);
  public void SetData(vtkDataArray id0)
  {
    SetData_6(id0);
  }

  private native long GetData_7();
  public vtkDataArray GetData()
  {
    long temp = GetData_7();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataType_8();
  public int GetDataType()
  {
    return GetDataType_8();
  }

  private native void SetDataType_9(int id0);
  public void SetDataType(int id0)
  {
    SetDataType_9(id0);
  }

  private native void SetDataTypeToBit_10();
  public void SetDataTypeToBit()
  {
    SetDataTypeToBit_10();
  }

  private native void SetDataTypeToChar_11();
  public void SetDataTypeToChar()
  {
    SetDataTypeToChar_11();
  }

  private native void SetDataTypeToUnsignedChar_12();
  public void SetDataTypeToUnsignedChar()
  {
    SetDataTypeToUnsignedChar_12();
  }

  private native void SetDataTypeToShort_13();
  public void SetDataTypeToShort()
  {
    SetDataTypeToShort_13();
  }

  private native void SetDataTypeToUnsignedShort_14();
  public void SetDataTypeToUnsignedShort()
  {
    SetDataTypeToUnsignedShort_14();
  }

  private native void SetDataTypeToInt_15();
  public void SetDataTypeToInt()
  {
    SetDataTypeToInt_15();
  }

  private native void SetDataTypeToUnsignedInt_16();
  public void SetDataTypeToUnsignedInt()
  {
    SetDataTypeToUnsignedInt_16();
  }

  private native void SetDataTypeToLong_17();
  public void SetDataTypeToLong()
  {
    SetDataTypeToLong_17();
  }

  private native void SetDataTypeToUnsignedLong_18();
  public void SetDataTypeToUnsignedLong()
  {
    SetDataTypeToUnsignedLong_18();
  }

  private native void SetDataTypeToFloat_19();
  public void SetDataTypeToFloat()
  {
    SetDataTypeToFloat_19();
  }

  private native void SetDataTypeToDouble_20();
  public void SetDataTypeToDouble()
  {
    SetDataTypeToDouble_20();
  }

  private native void Squeeze_21();
  public void Squeeze()
  {
    Squeeze_21();
  }

  private native void Reset_22();
  public void Reset()
  {
    Reset_22();
  }

  private native void DeepCopy_23(vtkPoints id0);
  public void DeepCopy(vtkPoints id0)
  {
    DeepCopy_23(id0);
  }

  private native void ShallowCopy_24(vtkPoints id0);
  public void ShallowCopy(vtkPoints id0)
  {
    ShallowCopy_24(id0);
  }

  private native long GetActualMemorySize_25();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_25();
  }

  private native long GetNumberOfPoints_26();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_26();
  }

  private native double[] GetPoint_27(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_27(id0);
  }

  private native void GetPoint_28(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_28(id0,id1);
  }

  private native void SetPoint_29(long id0,float id1[]);
  public void SetPoint(long id0,float id1[])
  {
    SetPoint_29(id0,id1);
  }

  private native void SetPoint_30(long id0,double id1[]);
  public void SetPoint(long id0,double id1[])
  {
    SetPoint_30(id0,id1);
  }

  private native void SetPoint_31(long id0,double id1,double id2,double id3);
  public void SetPoint(long id0,double id1,double id2,double id3)
  {
    SetPoint_31(id0,id1,id2,id3);
  }

  private native void InsertPoint_32(long id0,float id1[]);
  public void InsertPoint(long id0,float id1[])
  {
    InsertPoint_32(id0,id1);
  }

  private native void InsertPoint_33(long id0,double id1[]);
  public void InsertPoint(long id0,double id1[])
  {
    InsertPoint_33(id0,id1);
  }

  private native void InsertPoint_34(long id0,double id1,double id2,double id3);
  public void InsertPoint(long id0,double id1,double id2,double id3)
  {
    InsertPoint_34(id0,id1,id2,id3);
  }

  private native void InsertPoints_35(vtkIdList id0,vtkIdList id1,vtkPoints id2);
  public void InsertPoints(vtkIdList id0,vtkIdList id1,vtkPoints id2)
  {
    InsertPoints_35(id0,id1,id2);
  }

  private native void InsertPoints_36(long id0,long id1,long id2,vtkPoints id3);
  public void InsertPoints(long id0,long id1,long id2,vtkPoints id3)
  {
    InsertPoints_36(id0,id1,id2,id3);
  }

  private native long InsertNextPoint_37(float id0[]);
  public long InsertNextPoint(float id0[])
  {
    return InsertNextPoint_37(id0);
  }

  private native long InsertNextPoint_38(double id0[]);
  public long InsertNextPoint(double id0[])
  {
    return InsertNextPoint_38(id0);
  }

  private native long InsertNextPoint_39(double id0,double id1,double id2);
  public long InsertNextPoint(double id0,double id1,double id2)
  {
    return InsertNextPoint_39(id0,id1,id2);
  }

  private native void SetNumberOfPoints_40(long id0);
  public void SetNumberOfPoints(long id0)
  {
    SetNumberOfPoints_40(id0);
  }

  private native int Resize_41(long id0);
  public int Resize(long id0)
  {
    return Resize_41(id0);
  }

  private native void GetPoints_42(vtkIdList id0,vtkPoints id1);
  public void GetPoints(vtkIdList id0,vtkPoints id1)
  {
    GetPoints_42(id0,id1);
  }

  private native void ComputeBounds_43();
  public void ComputeBounds()
  {
    ComputeBounds_43();
  }

  private native double[] GetBounds_44();
  public double[] GetBounds()
  {
    return GetBounds_44();
  }

  private native void GetBounds_45(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_45(id0);
  }

  private native long GetMTime_46();
  public long GetMTime()
  {
    return GetMTime_46();
  }

  private native void Modified_47();
  public void Modified()
  {
    Modified_47();
  }

  public vtkPoints() { super(); }

  public vtkPoints(long id) { super(id); }
  public native long   VTKInit();

}
