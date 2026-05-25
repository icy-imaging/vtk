// java wrapper for vtkOpenGLVertexBufferObject object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLVertexBufferObject extends vtkOpenGLBufferObject
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

  private native void UploadDataArray_4(vtkDataArray id0);
  public void UploadDataArray(vtkDataArray id0)
  {
    UploadDataArray_4(id0);
  }

  private native void AppendDataArray_5(vtkDataArray id0);
  public void AppendDataArray(vtkDataArray id0)
  {
    AppendDataArray_5(id0);
  }

  private native boolean GetCoordShiftAndScaleEnabled_6();
  public boolean GetCoordShiftAndScaleEnabled()
  {
    return GetCoordShiftAndScaleEnabled_6();
  }

  private native int GetCoordShiftAndScaleMethod_7();
  public int GetCoordShiftAndScaleMethod()
  {
    return GetCoordShiftAndScaleMethod_7();
  }

  private native void SetCoordShiftAndScaleMethod_8(int id0);
  public void SetCoordShiftAndScaleMethod(int id0)
  {
    SetCoordShiftAndScaleMethod_8(id0);
  }

  private native void SetShift_9(double id0,double id1,double id2);
  public void SetShift(double id0,double id1,double id2)
  {
    SetShift_9(id0,id1,id2);
  }

  private native void SetScale_10(double id0,double id1,double id2);
  public void SetScale(double id0,double id1,double id2)
  {
    SetScale_10(id0,id1,id2);
  }

  private native void UpdateShiftScale_11(vtkDataArray id0);
  public void UpdateShiftScale(vtkDataArray id0)
  {
    UpdateShiftScale_11(id0);
  }

  private native void SetGlobalCoordShiftAndScaleEnabled_12(int id0);
  public void SetGlobalCoordShiftAndScaleEnabled(int id0)
  {
    SetGlobalCoordShiftAndScaleEnabled_12(id0);
  }

  private native void GlobalCoordShiftAndScaleEnabledOn_13();
  public void GlobalCoordShiftAndScaleEnabledOn()
  {
    GlobalCoordShiftAndScaleEnabledOn_13();
  }

  private native void GlobalCoordShiftAndScaleEnabledOff_14();
  public void GlobalCoordShiftAndScaleEnabledOff()
  {
    GlobalCoordShiftAndScaleEnabledOff_14();
  }

  private native int GetGlobalCoordShiftAndScaleEnabled_15();
  public int GetGlobalCoordShiftAndScaleEnabled()
  {
    return GetGlobalCoordShiftAndScaleEnabled_15();
  }

  private native void SetDataType_16(int id0);
  public void SetDataType(int id0)
  {
    SetDataType_16(id0);
  }

  private native int GetDataType_17();
  public int GetDataType()
  {
    return GetDataType_17();
  }

  private native int GetDataTypeSize_18();
  public int GetDataTypeSize()
  {
    return GetDataTypeSize_18();
  }

  private native int GetNumberOfTuples_19();
  public int GetNumberOfTuples()
  {
    return GetNumberOfTuples_19();
  }

  private native int GetNumberOfComponents_20();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_20();
  }

  private native void SetStride_21(int id0);
  public void SetStride(int id0)
  {
    SetStride_21(id0);
  }

  private native int GetStride_22();
  public int GetStride()
  {
    return GetStride_22();
  }

  private native void UploadVBO_23();
  public void UploadVBO()
  {
    UploadVBO_23();
  }

  private native void SetCache_24(vtkOpenGLVertexBufferObjectCache id0);
  public void SetCache(vtkOpenGLVertexBufferObjectCache id0)
  {
    SetCache_24(id0);
  }

  private native void SetCamera_25(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_25(id0);
  }

  private native void SetProp3D_26(vtkProp3D id0);
  public void SetProp3D(vtkProp3D id0)
  {
    SetProp3D_26(id0);
  }

  public vtkOpenGLVertexBufferObject() { super(); }

  public vtkOpenGLVertexBufferObject(long id) { super(id); }
  public native long   VTKInit();

}
